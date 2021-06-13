import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5_Get
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        //driver.get("https://apple.com");
        //System.out.println(driver.getTitle());

        driver.close();


    }
}
