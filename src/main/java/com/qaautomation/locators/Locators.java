package com.qaautomation.locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Username using ID
        driver.findElement(By.id("inputUsername"))
              .sendKeys("Arzoo");

        // Password using Name
        driver.findElement(By.name("inputPassword"))
              .sendKeys("wrong password");

        // Sign In using Class Name
        driver.findElement(By.className("signInBtn"))
              .click();
        System.out.println(
    driver.findElement(By.cssSelector("p.error")).getText()
);  
    }
}
