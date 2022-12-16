package BD.com.NewAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Radio_CheckBox extends BaseUrl{
	@Test (priority = 0)
	public void OpenBrowser() throws InterruptedException {
		driver.get(iteraUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test (priority = 1)
	public void radioCheckBox() throws InterruptedException {
		WebElement genderFemale = driver.findElement(By.id("female"));
		genderFemale.click();
		
		Thread.sleep(2000);
		
		
		WebElement checkBoxTuesDay = driver.findElement(By.id("tuesday"));
		
		checkBoxTuesDay.click();
		Thread.sleep(2000);
		
        WebElement friDay = driver.findElement(By.id("friday"));
		
		friDay.click();
		Thread.sleep(2000);
	}
}
