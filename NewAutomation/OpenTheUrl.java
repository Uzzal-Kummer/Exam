package BD.com.NewAutomation;

import org.testng.annotations.Test;

public class OpenTheUrl extends BaseUrl{
	@Test
	public void openUrl() throws InterruptedException {
		
		driver.get(iteraUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

}
