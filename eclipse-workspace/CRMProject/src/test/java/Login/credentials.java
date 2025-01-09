package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class credentials {
	@Test
	public void creds(){
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://dev.crm.skillcapital.ai/");
		
		driver.manage().window().maximize();
		
//	
//	//find username and giving its value
	WebElement txtbx_username=driver.findElement(By.id("username"));
			txtbx_username.sendKeys("admin");
//			
////find Password and sending key
		driver.findElement(By.name("password")).sendKeys("admin@!23");
		
//		 							(or)
//		WebElement txt_password=driver.findElement(By.name("password"));
//		txt_password.sendKeys("admin@!23");
//		
	
		WebElement LoginButton = driver.findElement(By.xpath("//button[text()='Login']"));
		LoginButton.click();
}

}