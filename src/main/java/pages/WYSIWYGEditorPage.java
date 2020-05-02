package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    private WebDriver driver;
    public WYSIWYGEditorPage(WebDriver driver){this.driver=driver;}

    private String editorFrameId = "mce_0_ifr";
    private By textArea = By.cssSelector("#tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");


    public void clearTheTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea (String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void decreseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditArea();
      String text =  driver.findElement(textArea).getText();
      switchToMainArea();
      return text;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorFrameId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
