import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S17_Iframes
{
    WebDriver driver;

    @BeforeMethod
    public void bm()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("beforeMethod calisti");
    }
    @Test
    public void t1() throws InterruptedException
    {

        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        Thread.sleep(1000);
        //driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frame1\"]")));
        //driver.switchTo().frame(0);
        driver.switchTo().frame("frame1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/input")).sendKeys("asdf");
        Thread.sleep(1000);
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/ol/li[1]/a")).click();



    }
}
