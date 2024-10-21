package com.testAcademy.exSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RG_awesomeqa {
    @Test
    public void registration() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        driver.findElement(By.name("firstname")).sendKeys("Ansh");
        driver.findElement(By.name("lastname")).sendKeys("Test");
        driver.findElement(By.name("email")).sendKeys("Ansh01@yopmail.com");
        driver.findElement(By.name("telephone")).sendKeys("789696520");
        driver.findElement(By.name("password")).sendKeys("Test@123");
        driver.findElement(By.name("confirm")).sendKeys("Test@123");
        driver.findElement(By.name("agree")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("btn-primary")).click();
        if (driver.getPageSource().contains("Your Account Has Been Created!")) {
            System.out.println("This is exist");
            Assert.assertTrue(true);
        } else {

            Assert.assertTrue(false);
        }
        driver.quit();
    }
}
