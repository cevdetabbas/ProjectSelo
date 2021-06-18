import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class S14_DataTables
{
    WebDriver driver;

    @BeforeMethod
    public void bm()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("beforeMethod calisti");
    }
    @AfterMethod
    public void am()
    {
        driver.quit();
        System.out.println("after method google i kapat ti");
    }

    @Test
    public void t1() throws InterruptedException
    {

        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        Thread.sleep(2000);


        String a = driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr[3]/td[2]")).getText();
        System.out.println("a = " + a);
        String b = driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr[3]/td[2]/following-sibling::td")).getText();
        String c = driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr[3]/td[2]/preceding-sibling::td")).getText();
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }




}
