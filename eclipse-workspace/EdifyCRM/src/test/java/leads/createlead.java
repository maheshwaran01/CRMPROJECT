package leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class createlead {
	public class Login {
		WebDriver driver;
		@Parameters("browser")
		@BeforeClass
		public void setup(String browser) {
			if(browser.equalsIgnoreCase("chrome")){
				driver=new ChromeDriver();
				System.out.println("Chrome is launched");
			}
				else if(browser.equalsIgnoreCase("Firefox")) {
					driver=new FirefoxDriver();
					System.out.println("Firefox is launched");
					
				}
				else if(browser.equalsIgnoreCase("Edge")) {
					driver=new EdgeDriver(); 	
					System.out.println("Edge is launched");
			}
			
			driver.manage().window().maximize();
			driver.get("https://crm.digitaledify.ai/");
		}
			
			@Test
			public void logintest() {
			
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin@!23");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			driver.findElement(By.xpath("//span[text()='Campaigns']")).click();
			driver.findElement(By.xpath("//span[text()='Leads']")).click();
			driver.findElement(By.xpath("//span[text()='Opportunities']")).click();
			driver.findElement(By.xpath("//span[text()='Learners']")).click();
			driver.findElement(By.xpath("//span[text()='Batches']")).click();
			driver.findElement(By.xpath("//span[text()='Trainers']")).click();
			driver.findElement(By.xpath("//span[text()='Tasks']")).click();
			driver.findElement(By.xpath("//span[text()='Analytics']")).click();
			
		}

	}

}
