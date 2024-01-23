package data;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PP {

	
	@Test
	public void verifyProductlink() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
        driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
	String actualvalue=driver.findElement(By.xpath("//h1[@class=\"float-left\"]")).getText();
	String Expectedvalue="Products";
	Assert.assertEquals(actualvalue, Expectedvalue);
	driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
	driver.close();
	
	}
	
	@Test
	public void verifySearchProduct() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
        driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
		driver.findElement(By.id("SearchProductName")).sendKeys("Apple MacBook Pro 13-inch");
		driver.findElement(By.id("search-products")).click();
		driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
		driver.close();
	}
}
