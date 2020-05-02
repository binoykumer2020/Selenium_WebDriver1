package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
      AlertsPage alertsPage = homePage.clickJSAlerts();
      alertsPage.triggerAlert();
      alertsPage.alert_clickToAccept();
      assertTrue(alertsPage.getResult().contains("You successfuly clicked an alert"),
              "incorrect alert message");
    }

    @Test
    public void testGetTextFromAlert(){
        AlertsPage alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testInputTextinAlert(){
        AlertsPage alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerPrompt();

        String text = "Ishaan rocks!";
        alertsPage.alert_inputText(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: " +text ,"Incorrect");
    }

}
