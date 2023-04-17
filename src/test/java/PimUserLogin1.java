import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PimUserLogin1 {

    @Test

    public void UserLoginSuccess(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().setSize(new Dimension(1440, 777));
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector(".oxd-button")).click();
        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.cssSelector(".oxd-button--secondary:nth-child(1)")).click();
        driver.findElement(By.name("firstName")).click();
        driver.findElement(By.name("firstName")).sendKeys("MD");
        driver.findElement(By.name("lastName")).click();
        driver.findElement(By.name("lastName")).sendKeys("Chowdhury");
        driver.findElement(By.cssSelector(".oxd-switch-input")).click();
        driver.findElement(By.cssSelector(".oxd-input--focus")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("miraj522");
        driver.findElement(By.cssSelector(".oxd-input-group:nth-child(1) > div > .oxd-radio-wrapper .oxd-radio-input")).click();
        driver.findElement(By.cssSelector(".oxd-input--focus")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div")).sendKeys("Mkona511@");
        driver.findElement(By.cssSelector(".orangehrm-employee-image")).click();
        driver.findElement(By.cssSelector(".oxd-input--focus")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("Mkona511@");
        driver.findElement(By.cssSelector(".user-password-row")).click();
        driver.findElement(By.cssSelector(".oxd-button--secondary")).click();
        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.cssSelector(".oxd-autocomplete-text-input--focus > input")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("MD  Chowdhury");
        {
            WebElement element = driver.findElement(By.cssSelector(".oxd-grid-item:nth-child(5) .oxd-input-group__label-wrapper"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
    }
    }

