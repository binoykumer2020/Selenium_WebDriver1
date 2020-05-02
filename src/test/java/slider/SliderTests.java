package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class SliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider (){
       HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
       horizontalSliderPage.setRange();
    }
}
