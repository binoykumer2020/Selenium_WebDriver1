package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    public InfiniteScrollPage (WebDriver driver){this.driver=driver;}

    private By textBlocks = By.className("jscroll-added");

    /**
     * Scrolls until paragraph with index specifoed is in view
     * @param index 1-based
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (howmanyParagraphsPresent() <index ){
                jsExecutor.executeScript(script);
        }
    }
    public int howmanyParagraphsPresent ( ){
        return driver.findElements(textBlocks).size();
    }
}
