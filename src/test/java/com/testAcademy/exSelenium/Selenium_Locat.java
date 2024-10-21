package com.testAcademy.exSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Locat {
    @Test
    public void login_Negative() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/");
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        driver.findElement(By.id("login-username")).sendKeys("ansh@yopmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Ansh@123");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(3000);
        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

    }


}
