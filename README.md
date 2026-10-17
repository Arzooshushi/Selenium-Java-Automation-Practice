# Selenium Java Automation Practice

Hands-on Selenium WebDriver practice using Java, Maven, and Rahul Shetty Academy web applications. This repository will grow as I complete new Selenium topics and independent exercises.

## Current practical: ID, Name & Class Name Locators

**Application:** [Rahul Shetty Academy — Locators Practice](https://rahulshettyacademy.com/locatorspractice/)

**Covered in this example:**
- Locate username input using `By.id("inputUsername")` and type with `sendKeys()`.
- Locate password input using `By.name("inputPassword")` and enter an intentionally incorrect password.
- Locate Sign In button using `By.className("signInBtn")` and click it.
- Manually observe the application's **"Incorrect username or password"** validation message.

**Important:** This is a learning **locator demo**, not yet an assertion-based automated test. Error-message assertions, waits, and test frameworks will be added after those topics are covered in the course.

## Stack
- Java 17
- Selenium Java 4.50.0
- Maven
- Chrome / ChromeDriver (Selenium Manager handles driver management in typical setups)

## Run locally

1. Import this folder as an **Existing Maven Project** into Eclipse.
2. Ensure Java 17 and Google Chrome are available; let Maven resolve dependencies.
3. Run `com.qaautomation.locators.Locators` as a Java application.

The program launches the practice application, submits deliberately invalid login details, and closes the browser. The error result was confirmed manually during the original Eclipse exercise; this version does not assert the error message.

## Learning progress

| Topic | Status |
| --- | --- |
| Browser launch & navigation | Completed |
| ID, Name, Class Name locators | Completed |
| `sendKeys()` and `click()` | Completed |
| CSS Selectors, XPath, Waits, Assertions | Upcoming |

## Portfolio practices

No real passwords, API keys, build outputs, or local IDE files should be committed.
