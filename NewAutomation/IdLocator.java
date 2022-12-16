package BD.com.NewAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IdLocator extends BaseUrl{
	@Test (priority = 0)
	public void OpenBrowser() throws InterruptedException {
		driver.get(iteraUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test (priority = 1)
	public void testLocator() throws InterruptedException {
		WebElement nameId = driver.findElement(By.id("name"));
		nameId.sendKeys("uzzal");
		Thread.sleep(2000);
		
		WebElement mobileId = driver.findElement(By.id("phone"));
		mobileId.sendKeys("01631230372");
		Thread.sleep(2000);
		
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("uzzalkumarwub@gmail.com");
		Thread.sleep(2000);
		
		WebElement passwordId = driver.findElement(By.id("password"));
		passwordId.sendKeys("12345");
		Thread.sleep(2000);
		
		WebElement addressId = driver.findElement(By.id("address"));
		addressId.sendKeys("dhaka,bangladesh");
		Thread.sleep(2000);
		
		WebElement nameLocator = driver.findElement(By.name("submit"));
		nameLocator.click();
		Thread.sleep(2000);
		
		
		
		
	}
	
}
