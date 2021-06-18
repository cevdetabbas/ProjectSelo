import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverReader
{
    public static WebDriver getDriver(String a)
    {
        if(a.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        else if (a.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        else if (a.equalsIgnoreCase("opera"))
        {
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        }
        else if (a.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
        else
        {
            System.out.println("no such a driver");
            return null;
        }
    }
}
