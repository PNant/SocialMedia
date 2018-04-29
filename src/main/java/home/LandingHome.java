package home;
//import org.openqa.selenium.firefox.FirefoxDriver;*/

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class LandingHome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\Users\\prisc\\IdeaProjects\\SocialMediaAutomationFramework\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Inkvoke Firefox Browser
        //System.setProperty("webdriver.gecko.driver", "/Users/prisc/eclipse-workspace/SeleniumProject1.1/driver");
        //WebDriver driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        //Hit URL on the browser
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        //1. Validate whether title of page is correct
        System.out.println(driver.getTitle());

        //2. Validate that you've landed on the correct page
        System.out.println(driver.getCurrentUrl);

        //3. Print out the page source
        System.out.println(driver.getPageSource());

        //4. Enter email in email box
        driver.findElement(By.id("email")).sendKeys("prisgray861@hotmail.com");

        //5. Enter password
        driver.findElement(By.name("pass")).sendKeys("SocialMediaTeam2");

        //6. Enter password
        driver.findElement(By.id("u_0_9")).click();

        //6. Enter password
        driver.findElement(By.linkTest("Forgot account?")).click();




    }
}
