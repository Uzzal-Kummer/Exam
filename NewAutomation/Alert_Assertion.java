package BD.com.NewAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert_Assertion extends BaseUrl{
	
	@Test (priority = 0)
	public void openBrowser() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);		
	}
	
	@Test (priority = 1)
	public void alertEx() throws InterruptedException {
		
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		jsAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String alterOK = result.getText();
		Assert.assertEquals(alterOK, "You successfully clicked an alert");
		
		jsConfirm.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		String alertCancen = result.getText();
		Assert.assertEquals(alertCancen, "You clicked: Cance");
		Thread.sleep(2000);
		
		jsPrompt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("hello world");
		driver.switchTo().alert().accept();
		String jsInput = result.getText();
		Assert.assertEquals(jsInput,"You entered: hello world");
		Thread.sleep(2000);
		
	}

}
