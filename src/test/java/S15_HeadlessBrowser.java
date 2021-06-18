import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S15_HeadlessBrowser
{
    WebDriver driver;
    @BeforeMethod
    public void openChrome() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\honeybadger\\IdeaProjects\\ProjectHoneyBadger\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        Thread.sleep(3000);
    }
    @Test
    public void t1()
    {
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}
