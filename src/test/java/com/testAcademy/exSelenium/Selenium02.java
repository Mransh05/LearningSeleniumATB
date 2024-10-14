package com.testAcademy.exSelenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test

    public void test01() throws InterruptedException {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");
        Thread.sleep(2000);
        driver.quit();
    }
}
