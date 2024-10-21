package com.testAcademy.Plus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invetory {
    @Test
    public void invent() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://doctorclinic.ifour-consultancy.net");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.cssSelector("input[id$='mat-input-2']"));
        email.sendKeys("ifour.anshul@gmail.com");
        /*
        driver.findElement(By.cssSelector("input[id$='mat-input-3']")).sendKeys("Test@123");
        driver.findElement(By.id("kt_login_signin_submit")).click();
*/

    }
}
