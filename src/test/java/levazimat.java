import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class levazimat
{
    static WebDriver driver;
    private static Properties properties =new Properties();
    //levazimat(){}
    static
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("conf.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        }catch (Exception e){}


    }
    public static String getProperty(String a)
    {
        return properties.getProperty(a);
    }

    @BeforeMethod
    public void bm()
    {
        driver=WebDriverReader.getDriver(ConfReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static Object getDriver(String a)
    {
        if (a.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (a.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (a.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        } else if (a.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();

        } else if (a.equalsIgnoreCase("chrome-headless")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver(new ChromeOptions().setHeadless(true));
        }
        else if (a.equalsIgnoreCase("firefox-headless")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver(new FirefoxOptions().setHeadless(true));
        }
            else {
            System.out.println("no such a driver");
            return null;
        }
    }
    public static void bekle(int a)
    {
        try
        {
        Thread.sleep(a*1000);
        }
        catch (Exception e){}
    }
    public static void bekle()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e){}
    }


    public static Object getDriver() {
        if (levazimat.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (levazimat.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (levazimat.getProperty("browser").equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        } else if (levazimat.getProperty("browser").equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else {
            System.out.println("no such a driver");
            return null;
        }
    }
}
