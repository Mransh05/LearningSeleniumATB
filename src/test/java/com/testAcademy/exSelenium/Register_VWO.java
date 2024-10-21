package com.testAcademy.exSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Register_VWO {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/");
        driver.findElement(By.linkText("Start a free trial")).click();
        driver.findElement(By.name("email")).sendKeys("Ansh@yopmail.com");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();
        List<WebElement> buttonlist = driver.findElements(By.tagName("button"));
        buttonlist.get(0).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement message = driver.findElement(By.className("invalid-reason"));
        System.out.println(message.getText());


    }
}