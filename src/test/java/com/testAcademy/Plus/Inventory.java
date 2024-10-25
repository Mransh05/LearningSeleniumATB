package com.testAcademy.Plus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Inventory {
    WebDriver driver;

    @Test(priority = 0)
    public void Login() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://doctorclinic.ifour-consultancy.net");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@formcontrolname=\"UserName\"]")).sendKeys("ifour.anshul@gmail.com");
        driver.findElement(By.xpath("//input[@formcontrolname=\"Password\"]")).sendKeys("Test@123");
        driver.findElement(By.id("kt_login_signin_submit")).click();
    }

    /*
        @Test(priority = 1)
        public void Navaigation_Var() throws InterruptedException {
            Thread.sleep(2000);
            WebElement nav_bar = driver.findElement(By.xpath("//div[@id=\"kt_header_menu\"]"));
            List<WebElement> allelements = nav_bar.findElements(By.xpath("//ul[@class=\"kt-menu__nav\"]"));
            System.out.println("List of menus count in navigation var" + allelements.size());

            for (int i =0; i < allelements.size(); i++) {
                WebElement element = allelements.get(i);
                System.out.println(i + " : " + element.getText());
            }

        }

     */
    @Test
    public void setup() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='kt_header_menu']//ul[contains(@class, 'kt-menu__nav')]//li//a[normalize-space(text())='Setup'])")).click();

    }

}
