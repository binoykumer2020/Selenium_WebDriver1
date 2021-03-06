package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotpassword() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPressess() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJSAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public EntryAdModalPage clickEntryAdModal() {
        clickLink("Entry Ad");
        return new EntryAdModalPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYG() {
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom ( ){
        clickLink("Large & Deep DOM");
        return new  LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll ( ){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows ( ){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage (driver);
    }

    public FramesPage clickFrames (){
        clickLink("Frames");
        return new FramesPage(driver);
    }
}