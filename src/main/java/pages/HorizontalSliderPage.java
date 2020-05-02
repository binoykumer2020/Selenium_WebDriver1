package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private WebDriver driver;
    public HorizontalSliderPage (WebDriver driver){this.driver=driver;}

    private By sliderContainer = By.cssSelector(".sliderContainer");
    private By range = By.xpath("//div[@class='sliderContainer']//input");


    public void sliderContainer (){
       WebElement slider = driver.findElement(sliderContainer);
       slider.sendKeys(Keys.ARROW_RIGHT);
    }

    public void setRange ( ){
        driver.findElement(range).sendKeys(Keys.ARROW_RIGHT);
    }
}
