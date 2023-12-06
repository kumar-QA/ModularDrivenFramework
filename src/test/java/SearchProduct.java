import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import data.CommonSteps;

public class SearchProduct {

	WebDriver driver;
	
	CommonSteps cs=new  CommonSteps();
	@Test
	public void ProductSearch() throws InterruptedException {
		driver=cs.openBrowser();
		cs.EnterUrl();
		cs.login();
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-book']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("SearchProductName")).sendKeys("Apple MacBook Pro 13-inch");
		driver.findElement(By.id("search-products")).click();
		Thread.sleep(2000);
		cs.logout();
		cs.closeBrowser();
		
	}
	
}
