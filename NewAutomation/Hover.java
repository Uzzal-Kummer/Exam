package BD.com.NewAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends BaseUrl{
	
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test (priority = 1)
	public void hoverTest() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		WebElement autoMobile = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement  ridingGear = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		
		action.moveToElement(autoMobile).perform();
		Thread.sleep(2000);
		action.moveToElement(ridingGear).perform();
		Thread.sleep(2000);
		helmet.click();
		Thread.sleep(2000);
		
	}
}
