package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;

    private By emailField = By.id("email");
    private By retrievePasswordField  = By.cssSelector("#forgot_password button");

    public  ForgotPasswordPage (WebDriver driver){ this.driver=driver; }

    public void provideEmail (String provideEmail){
        driver.findElement(emailField).sendKeys(provideEmail);
    }

    public EmailSentPage clickRetievePasswordLink (){
        driver.findElement(retrievePasswordField).click();
        return new EmailSentPage(driver);
    }


}
