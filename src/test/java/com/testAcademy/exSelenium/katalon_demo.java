package com.testAcademy.exSelenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class katalon_demo {
    @Description("Verify that the One line form the page source")
    @Test
    public void testKatlon() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        Assert.assertTrue(driver.getPageSource().contains("CURA Healthcare Service"));
    }
}
