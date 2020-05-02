package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdModalPage {

    private WebDriver driver;
    public EntryAdModalPage(WebDriver driver){this.driver=driver;}

    private By modalFooter = By.cssSelector(".modal-footer");

    public void closeTheFooter (){
        driver.findElement(modalFooter);
    }

}
// /Users/binoy.kumer/Documents/workspace/testautomationuni/Selenium_Java_binoy/.idea