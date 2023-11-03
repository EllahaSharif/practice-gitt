package tek.tdd.test.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.pages.HomePage;
import tek.tdd.pages.UIBaseTest;

public class HomePageTitleTest extends UIBaseTest {
    @Test
    public void pageHeaderT(){
        HomePage homePage = new HomePage();
        String actualHeaderTitle = homePage.pageHeader.getText();

        Assert.assertEquals(actualHeaderTitle,"TEK Insurance Portal","validate page title");
    }
    @Test
    public void validateLoginSectionTitle(){
HomePage homePage= new HomePage();
String actualText = HomePage.sectionCardTitlegetText();
Assert.assertEquals(actualText,"");

    }

}
