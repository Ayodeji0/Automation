import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeManager {

    @Test
    void login()  {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://dev-ehrpm.automedsys.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("deji@automedsys.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("P@rfect2");
        driver.findElement(By.xpath("//input[@id='PracticeRefNumber']")).sendKeys("aal20201001");
        driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();

    }


}
