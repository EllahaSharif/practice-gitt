package tek.tdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utility.SeleniumUtility;

public class HomePage extends SeleniumUtility {



    public HomePage(){
        PageFactory.initElements(getDriver(),this );
    }
    @FindBy(xpath = "//mat-toolbar/span[1]")
    public WebElement pageHeader;

    @FindBy(xpath = "//mat-card/mat-card-title[1]/strong")
    private WebElement sectionCardTitle;
}
