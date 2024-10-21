package com.testAcademy.exSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium_Navigation {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.navigate().to("https://www.bing.com/");
        driver.navigate().to(new URL("https://doctorclinic.ifour-consultancy.net/"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
