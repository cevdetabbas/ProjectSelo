import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S7_HandlingInputBoxes
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(3000);
        String a1 = "kamil";
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/div/input")).sendKeys(a1);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
        Thread.sleep(3000);
        if(driver.findElement(By.xpath("//*[@id=\"display\"]")).getText().equalsIgnoreCase(a1   ));
        {
            System.out.println("hadi bakalim testi gectin");
        }
        Thread.sleep(3000);

        int a = 5;
        driver.findElement(By.xpath("//*[@id=\"sum1\"]")).sendKeys(String.valueOf(a));
        Thread.sleep(3000);
        int b = 9;
        driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys(String.valueOf(b));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        Thread.sleep(3000);
        if(driver.findElement(By.xpath("//*[@id=\"displayvalue\"]")).getText().equalsIgnoreCase(String.valueOf(a+b)))
        {
            System.out.println("hadi bakalim ikince testide gectin");
        }


    }

}
