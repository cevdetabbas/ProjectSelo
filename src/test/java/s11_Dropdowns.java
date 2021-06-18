import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class s11_Dropdowns
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"select-demo\"]")));

        //select.selectByIndex(2);
        //select.selectByValue("Friday");


        Select select2 = new Select(driver.findElement(By.xpath("//*[@id=\"multi-select\"]")));

        System.out.println(select2.isMultiple());

        if(select2.isMultiple())
        {
            select2.selectByIndex(1);
            select2.selectByIndex(3);
            select2.selectByIndex(5);
        }

    }
}
