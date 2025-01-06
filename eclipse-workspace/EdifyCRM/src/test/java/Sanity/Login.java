package Sanity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;

		@Test
		public void logintest() {
			
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://crm.digitaledify.ai/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@!23");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}