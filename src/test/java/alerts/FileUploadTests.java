package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
      FileUploadPage fileUploadPage = homePage.clickFileUpload();
      fileUploadPage.uploadFile("/Users/binoy.kumer/Documents/workspace/testautomationuni/Selenium_Java_binoy/resources/chromedriver");

      assertEquals(fileUploadPage.getUploadedfiles(),"chromedriver","Incorrect file uploading");

    }
}
