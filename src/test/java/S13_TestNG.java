import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class S13_TestNG
{
    WebDriver driver;

    @BeforeMethod
    public void bm()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("beforeMethod calisti");
    }

    @Ignore
    @Test
    public void t1()
    {

        driver.get("https://google.com");
        Assert.assertFalse(driver.getTitle().equals("google"));

        System.out.println("google`a git");
    }
    @Test
    public void t2()
    {
        driver.get("https://apple.com");
        System.out.println("apple a gitti");
    }

    @AfterMethod
    public void am()
    {
        driver.quit();
        System.out.println("after method google i kapat ti");
    }

    @BeforeClass
    public void bc()
    {
        System.out.println("beforeClassAnnotationi");
    }

    @AfterClass
    public void ac()
    {
        System.out.println("afterClassAnnotationi");
    }

}
