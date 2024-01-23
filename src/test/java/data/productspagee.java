package data;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class productspagee {

	
	WebDriver driver;
	CommonSteps cs=new CommonSteps();
	@Test
	public void verifyProductlink() throws InterruptedException {
		
	   driver=cs.openBrowser();
	   cs.EnterUrl();
	   cs.login();
	   driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
	   driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
	  Thread.sleep(2000);
	   cs.logout();
	   cs.closeBrowser();
	}
	
	@Test
	public void verifyProductSearch() throws InterruptedException {
		
	  driver= cs.openBrowser();
	   cs.EnterUrl();
	   cs.login();
	   driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
	   driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("SearchProductName")).sendKeys("Adobe Photoshop CS4");
	  driver.findElement(By.id("search-products")).click();
	  
	   cs.logout();
	   cs.closeBrowser();
	   
	}
	@Test
	public void verifyAddButton() {
		driver= cs.openBrowser();
		   cs.EnterUrl();
		   cs.login();

		   cs.logout();
		   cs.closeBrowser();
	}
}
