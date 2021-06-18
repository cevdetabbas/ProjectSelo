import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s10_RadioButtons {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]")).click();

        Thread.sleep(1000);
        if(driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")).getText().equals("Radio button 'Male' is checked"))
        {
            System.out.println("confirmation alindi");
        }
    }

}
