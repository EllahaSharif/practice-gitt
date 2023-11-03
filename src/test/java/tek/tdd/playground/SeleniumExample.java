package tek.tdd.playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumExample {
    private WebDriver driver;
    @BeforeMethod
    public void initialBrowser(){
       driver = new ChromeDriver();
        driver.get("https://qa.insurance.tekschool-students.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    public void testApplicationTitle(){
     String application  = driver.getTitle();
        Assert.assertEquals(application,"Tek Insurance Services",
                "Validate Application");


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
