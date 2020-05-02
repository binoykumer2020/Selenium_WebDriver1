package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {

    private WebDriver driver;
    public FramesPage (WebDriver driver) { this.driver = driver;}

    private By bottomFrame = By.name("bottomFrame");

    public FramesPage clickNestedFrames ( ){
        driver.findElement(By.linkText("Nested Frames")).click();
        return null;
    }

    public void switchToBottomFrame (){
        driver.switchTo().frame((WebElement) bottomFrame);
    }
    // it didn't work need to investigate little more


}
