package Createlead;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class leads {
	
	public class Credentials02 {

	    WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Initialize the ChromeDriver
	        driver = new ChromeDriver();

	        // Maximize the browser window
	        driver.manage().window().maximize();
	    }

	    @Test(priority = 1)
	    public void openURL() {
	        // Open the specified URL
	        driver.get("https://dev.crm.skillcapital.ai/");
	    }

	    @Test(priority = 2)
	    public void enterCredentials() {
	        // Enter Username
	        WebElement txtbx_username = driver.findElement(By.id("username"));
	        txtbx_username.sendKeys("admin");

	        // Enter Password
	        WebElement txtbx_password = driver.findElement(By.name("password"));
	        txtbx_password.sendKeys("admin@!23");
	    }

	    @Test(priority = 3)
	    public void submitLogin() {
	        // Click on the login button
	        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
	        loginButton.click();
	    }

	   
	    }
	}

