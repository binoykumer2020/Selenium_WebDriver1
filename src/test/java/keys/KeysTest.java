package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTests {

    @Test
    public void testBackspace(){
       KeyPressesPage keyPressesPage = homePage.clickKeyPressess();
       keyPressesPage.enterText("Ishaan" + Keys.BACK_SPACE);
       assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE","Incorrect");
    }

    @Test
    public void testPi (){
        KeyPressesPage keyPressesPage = homePage.clickKeyPressess();
        keyPressesPage.enterPi();
    }

    @Test
    public void testEnterKey(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPressess();
        keyPressesPage.enterText("Binoy" +Keys.ENTER);
    }
}
