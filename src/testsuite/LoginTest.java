package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter username and password
        //driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        sendTextToElement(By.xpath("//input[@id='user-name']"), "standard_user");
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        sendTextToElement(By.xpath("//input[@id='password']"), "secret_sauce");
        // Click login button
        //driver.findElement(By.xpath("//input[@id='login-button']")).click();
        clickOnElement(By.xpath("//input[@id='login-button']"));
        //driver.findElement(By.xpath("//span[contains(text(),'Products')]")).click();
        clickOnElement(By.xpath("//span[contains(text(),'Products')]"));

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        // Enter username and password
        //driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        sendTextToElement(By.xpath("//input[@id='user-name']"), "standard_user");
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        sendTextToElement(By.xpath("//input[@id='password']"), "secret_sauce");
        // Click login button
        //driver.findElement(By.xpath("//input[@id='login-button']")).click();
        clickOnElement(By.xpath("//input[@id='login-button']"));
        //driver.findElement(By.xpath("//span[contains(text(),'Products')]")).click();
        clickOnElement(By.xpath("//span[contains(text(),'Products')]"));

        // Verify six products displayed on page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Numbers of links = " + links.size());
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}




