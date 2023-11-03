package tek.tdd.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity {
    private WebDriver driver;
  @BeforeMethod
    public void initializeTest(){
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      driver.get("");
  }
  @Test
    public void testHeader(){
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
      WebElement pageHeaderElement = wait.until(
              ExpectedConditions.visibilityOfElementLocated(
                      By.xpath("//mat-toolbar/span[1]")));
      String actualHeader = pageHeaderElement.getText();

      Assert.assertEquals(actualHeader ,"TEk Insurance Portal",
              "Validate Page header");

  }
  @AfterMethod
    public void closeBrowser(){
      driver.quit();
  }


}
