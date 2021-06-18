import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;

import java.util.concurrent.TimeUnit;

public abstract class TestBase
{
    WebDriver driver;
    @BeforeMethod
    public void bm()
    {
        driver=WebDriverReader.getDriver(ConfReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}
