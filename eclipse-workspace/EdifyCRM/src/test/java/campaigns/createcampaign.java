package campaigns;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createcampaign {

	public static void main(String args[]) {
		

		//1)Launch Chrome browser
	
	  WebDriver driver= new ChromeDriver();
	  
	  WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
	  
//2)Open URL
	driver.get("https:/dev.crm.digitaledify.ai/");
		
	 driver.manage().window().maximize();
		

		// 3)Enter Username and Password
		 //find Username and sending key
		 WebElement txtbx_username= driver.findElement(By.id("username"));
		 
		 txtbx_username.sendKeys("admin");
		
	
		 //find password and sending key
		 driver.findElement(By.name("password")).sendKeys("admin@!23");
		 
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Campaigns']"))).click();
		 
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Create Campaign']"))).click();
		

		 WebElement SelectElement=driver.findElement(By.name("campaignOwner"));
		   Select select=new Select(SelectElement);
		   select.selectByValue("1");
		   
		   driver.findElement(By.name("name")).sendKeys("Test");
		   driver.findElement(By.name("campaignDate")).sendKeys("2025-01-01");

	        
	}
	
}
