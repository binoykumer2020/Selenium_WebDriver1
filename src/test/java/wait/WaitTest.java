package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class WaitTest extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
       DynamicLoadingExample1Page dynamicLoadingExample1Page   = homePage.clickDynamicLoading().clickExample1();
       dynamicLoadingExample1Page.clickStart();
       assertEquals(dynamicLoadingExample1Page.getLoadText(), "Hello World!", "Incorrect text");
    }
}
