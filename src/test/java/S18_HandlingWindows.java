import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class S18_HandlingWindows
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

        driver.get("https://about.google/?fg=1&utm_source=google-US&utm_medium=referral&utm_campaign=hp-header");
        driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[2]/div/div[2]/div/a/div/div/picture/img")).click();
        Thread.sleep(1000);
        String a = driver.getWindowHandle();
        Set<String> windowhandles = driver.getWindowHandles();

        for(String each:windowhandles)
        {
            driver.switchTo().window(each);
            Thread.sleep(1000);
        }
        for(String each:windowhandles)
        {
            if(driver.switchTo().window(each).equals(a));
            break;
        }





        //driver.findElement(By.xpath("//*[@id=\"jump-content\"]/article/section[2]/div/div/div[5]/div/div/div/p[2]/a[1]")).click();




    }
}
