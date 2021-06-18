import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S16_Alerts
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
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
        Thread.sleep(1000);
        alert.dismiss();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
        System.out.println(alert.getText());
        alert.sendKeys("asdf");
        Thread.sleep(3000);
        alert.accept();


    }
}
