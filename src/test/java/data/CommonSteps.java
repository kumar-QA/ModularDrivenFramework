package data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {

	
ChromeDriver driver;
	
	public WebDriver openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public void EnterUrl() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
	
	public void login() {
		driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
        driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.className("login-button")).click();
	}
	
	public void logout() {
		driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
