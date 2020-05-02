package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    public DynamicLoadingPage (WebDriver driver){ this.driver=driver;}

    // on locators we just got [ a href ] and with lots of text which is dynamically change at any point of time
    // good practice is linkXpath_Format as both linkText has same value

    // private By linkPath = By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]");
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format,"Example 1"));



    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }


}
