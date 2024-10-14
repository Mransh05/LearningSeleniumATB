package com.testAcademy.exSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium03 {
    public static void main(String[] args) {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        edgeOptions.addArguments("--incognito");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://dev.azure.com/");
//https://peter.sh/experiments/chromium-command-line-switches/  [all chrome options arguments]
    }
}
