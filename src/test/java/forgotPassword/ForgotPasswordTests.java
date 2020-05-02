package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;


public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword (){
      ForgotPasswordPage forgotPasswordPage= homePage.clickForgotpassword();
      forgotPasswordPage.provideEmail("test123@gmail.com");
      EmailSentPage emailSentPage = forgotPasswordPage.clickRetievePasswordLink();
      assertTrue(emailSentPage.getAlertText().contains("Your e-mail's been sent!"),"Incorrect email sent");
    }
}
