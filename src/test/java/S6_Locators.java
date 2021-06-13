import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class S6_Locators
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        Thread.sleep(3000);
        //WebElement aboutButtonu = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]"));
        //System.out.println(aboutButtonu.getAttribute("href"));
        //aboutButtonu.click();
//        driver.findElement(By.className("MV3Tnb")).click();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("iphone");
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.className("gNO89b")).click();
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.xpath("//*[@id=\"tads\"]/div[1]/div/div/div[4]/div[1]/div[1]")).getText());


    }
}
