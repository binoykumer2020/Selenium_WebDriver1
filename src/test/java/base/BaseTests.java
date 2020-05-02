package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver= new ChromeDriver();
      //  driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        goHome();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome (){
        driver.get("https://the-internet.herokuapp.com/");
    }

   /* @AfterClass
    public void tearDown (){
        driver.quit();
    }*/

   // window manager handle
    public WindowManager getWindowManager ( ){
        return new WindowManager(driver);
    }


}
