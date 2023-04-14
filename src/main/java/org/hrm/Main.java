package org.hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        WebDriver driver = new ChromeDriver(); //Command to open chrome browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//cmd to goto url
        driver.manage().window().setSize(new Dimension(1440, 875));//cmd to maximise browser
        driver.findElement(By.name("username")).sendKeys("Admin");//cmd to enter username
        driver.findElement(By.name("password")).sendKeys("admin123"); //cmd to enter password
        driver.findElement(By.cssSelector(".oxd-button")).click(); //cmd to click login button
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("Admin")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Miraj");
        driver.findElement(By.cssSelector(".orangehrm-left-space")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //assertThat(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText(), is("Miraj"));
        if (driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText().equals("Miraj")) {
            System.out.println("Yes! Xpath text is Miraj!");
        } else {
            System.out.println("No! Xpath text is not Miraj!");
        }
        driver.findElement(By.cssSelector(".oxd-userdropdown-icon")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.close();
        driver.quit();
    }
}