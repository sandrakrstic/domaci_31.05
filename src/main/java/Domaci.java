import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Domaci {

  private WebDriver driver;

  @BeforeClass

    public void setUp() {
      System.setProperty("webdriver.chrome.driver", "D:\\Sandra\\kurs_qa\\hromdriver\\chromedriver_win32" +
              "\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
    }

    @BeforeMethod
    public void beforeMethod() {
      driver.navigate().to("https://www.telerik.com/support/demos");
    }

    @AfterClass
    public void afterMethod() {
      driver.close();
    }

    @Test
    public void testDesktopSection() {
        WebElement desktopBtn=driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[2]"));
        desktopBtn.click();
        String actualSectionTitle= desktopBtn.getText();
        String expectedSectionTitle= "Desktop";
         Assert.assertEquals(actualSectionTitle, expectedSectionTitle);
    }

    @Test
    public void testMobileSection() {
      WebElement mobileBtn= driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[3]"));
      mobileBtn.click();
      String actualMobileTitle= mobileBtn.getText();
      String expectedMobileTitle= "Mobile";
     Assert.assertEquals(actualMobileTitle, expectedMobileTitle);
    }


}
