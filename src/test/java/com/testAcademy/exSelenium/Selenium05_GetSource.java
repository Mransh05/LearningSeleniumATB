package com.testAcademy.exSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium05_GetSource {
    @Test
    public void Verify_PageSource() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("This is exist");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        driver.quit();
    }
}
