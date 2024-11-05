package com.testAcademy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class javascript_alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement OKAlrt = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        OKAlrt.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);
        driver.navigate().refresh();
        WebElement ConfirmAlrt = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        ConfirmAlrt.click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        String result2 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result2, "You clicked: Cancel");

        Thread.sleep(2000);
        driver.navigate().refresh();

        WebElement text = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        text.click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Hello Student");
        alert3.accept();



    }

}