package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {
    @Test
    public void testWysiwyg (){
      WYSIWYGEditorPage wysiwygEditorPage = homePage.clickWYSIWYG();
      wysiwygEditorPage.clearTheTextArea();

      String text1 = "Hello ";
      String text2 = "World!";

      wysiwygEditorPage.setTextArea(text1);
      wysiwygEditorPage.decreseIndention();
      wysiwygEditorPage.setTextArea(text2);

      assertEquals(wysiwygEditorPage.getTextFromEditor(), text1+text2, "Incorrect");

    }
}
