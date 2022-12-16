package BD.com.NewAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends BaseUrl{
	@Test (priority = 0)
	public void OpenBrowser() throws InterruptedException {
		driver.get(iteraUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test (priority = 1)
	public void dropDown() throws InterruptedException {
		WebElement selectCountry = driver.findElement(By.xpath("//select[@class ='custom-select']"));
		
		Select select = new Select(selectCountry);
		
		select.selectByVisibleText("Norway");
		
		Thread.sleep(2000);
	}
}
