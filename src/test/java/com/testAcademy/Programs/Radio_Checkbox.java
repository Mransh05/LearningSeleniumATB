package com.testAcademy.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.name("firstname")).sendKeys("Ansh");
        driver.findElement(By.name("lastname")).sendKeys("Singh");
        //Radio
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-2")).click();


        Thread.sleep(2000);
        driver.quit();
    }
}
