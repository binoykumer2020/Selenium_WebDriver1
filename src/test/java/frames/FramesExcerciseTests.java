package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FramesPage;

public class FramesExcerciseTests extends BaseTests {

    @Test
    public void testFrameExcercise (){
       FramesPage framesPage = homePage.clickFrames().clickNestedFrames();

    }
}
