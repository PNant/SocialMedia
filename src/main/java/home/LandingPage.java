/*
package home;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LandingPage {
    WebDriver driver = null;
    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "/Users/prisc/eclipse-workspace/SeleniumProject1.1/driver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Book");
    }

    @Test
    public void test2() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium Book");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
*/
