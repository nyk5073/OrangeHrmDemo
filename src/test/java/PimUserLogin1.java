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
    public void PimUserCreateTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.manage().window().setSize(new Dimension(1440, 777));
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".oxd-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("PIM")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".oxd-button--secondary:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstName")).sendKeys("MD");
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("Chowdhury");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".oxd-switch-input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("miraj524");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".oxd-input-group:nth-child(1) > div > .oxd-radio-wrapper .oxd-radio-input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("Mkona511@");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("Mkona511@");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".oxd-button--secondary")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("PIM")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("md");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div")).getText(),"MD");
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[4]/div")).getText(),"Chowdhury");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
        Thread.sleep(2000);
        driver.close();
    }
    }

