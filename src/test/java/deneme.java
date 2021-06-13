import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class deneme
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Thread.sleep(3000);
        List<WebElement> inputboxes = driver.findElements(By.xpath("//input"));
        Thread.sleep(3000);

        for (WebElement each : inputboxes)
        {
            Thread.sleep(3000);
            each.sendKeys("kamil");

        }
    }
}
