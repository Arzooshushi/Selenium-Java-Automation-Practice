package com.qaautomation.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

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
    }
}
