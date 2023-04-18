import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PimUserLogin1 {

    WebDriver driver;
    @Test
    public void PimUserCreateTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().setSize(new Dimension(1440, 777));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector(".oxd-button")).click();
        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.cssSelector(".oxd-button--secondary:nth-child(1)")).click();
        driver.findElement(By.name("firstName")).sendKeys("MD");
        driver.findElement(By.name("lastName")).sendKeys("Chowdhury");
        driver.findElement(By.cssSelector(".oxd-switch-input")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("miraj524");
        driver.findElement(By.cssSelector(".oxd-input-group:nth-child(1) > div > .oxd-radio-wrapper .oxd-radio-input")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("Mkona511@");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("Mkona511@");
        driver.findElement(By.cssSelector(".oxd-button--secondary")).click();
        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("md");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();

        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div")).getText(),"MD ");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[4]/div")).getText(),"Chowdhury");

        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
        driver.close();
    }
    }

