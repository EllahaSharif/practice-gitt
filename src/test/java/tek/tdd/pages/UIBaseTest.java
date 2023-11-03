package tek.tdd.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tek.tdd.utility.SeleniumUtility;

public class UIBaseTest extends SeleniumUtility {
    @BeforeMethod
    public void initializeTest() {
        openBrowser();
}
    @AfterMethod
    public void closeTest() {
        closeBrowser();

    }
}


