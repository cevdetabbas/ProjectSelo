import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithoutWebDriver
{
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


    }
}
