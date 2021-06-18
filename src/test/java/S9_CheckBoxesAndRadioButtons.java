import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S9_CheckBoxesAndRadioButtons
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

//        WebElement c1 = driver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]"));
//
//        if(!c1.isSelected())
//        {
//            c1.click();
//            if(driver.findElement(By.xpath("//*[@id=\"txtAge\"]")).getText().equals("Success - Check box is checked"))
//            {
//                System.out.println("checkbox confirmation works");
//            }
//        }

        WebElement option1 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input"));
        WebElement option2 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input"));
        WebElement option3 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input"));
        WebElement option4 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input"));

        WebElement checkAllBoxesButton = driver.findElement(By.xpath("//*[@id=\"check1\"]"));

        checkAllBoxesButton.click();

        if(option1.isSelected()&&option2.isSelected()&&option3.isSelected()&&option4.isSelected()&&checkAllBoxesButton.getAttribute("value").equals("Uncheck All"))
        {
            System.out.println("boxlari hepsi isaretlendi ve boxin yazisi Uncheck All a dondu");
        }

        option1.click();

        if(!(option1.isSelected()&&option2.isSelected()&&option3.isSelected()&&option4.isSelected()))
        {
            if(checkAllBoxesButton.getAttribute("value").equals("Check All"))
            {
            System.out.println("hepsinden en az biri eksik oldugunda button will change to check all");
            }
        }

    }
}
