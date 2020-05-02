package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputFieldText = By.id("target");
    private By resultText = By.id("result");
    public KeyPressesPage (WebDriver driver){this.driver=driver;}

    public void enterText(String text){
        driver.findElement(inputFieldText).sendKeys(text);
    }

    public String getResult(){
      return  driver.findElement(resultText).getText();
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"p") + "=3.14");
    }

}
