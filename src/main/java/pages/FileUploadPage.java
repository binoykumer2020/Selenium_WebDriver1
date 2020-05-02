package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    public FileUploadPage (WebDriver driver){this.driver=driver;}

    private By inputField = By.id("file-upload");
    private By uploadButton = By.cssSelector("#file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * provides absolute path to the form then clicks Upload button
     * @param absolutePathOfFile
     */
    public void uploadFile( String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedfiles(){
        return driver.findElement(uploadedFiles).getText();
    }
}
