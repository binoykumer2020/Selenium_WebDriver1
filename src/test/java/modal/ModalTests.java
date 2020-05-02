package modal;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EntryAdModalPage;

public class ModalTests extends BaseTests {
    @Test
    public void testModal (){
       EntryAdModalPage entryAdModalPage= homePage.clickEntryAdModal();
       entryAdModalPage.closeTheFooter();
    }
}
