package testcasess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserDefinedMethod {

	// Creating driver as global
	public static WebDriver driver;

	// Launch Browser
	public void Launchbrowser() {
		driver = new FirefoxDriver();
	}

	// Admin Login without parameters

	// User defined Methods
	public void Login() {
		driver.get("http://gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();

	}

	// Admin Login with parameters
	public void Login(String username, String password) {
		driver.get("http://gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}

	// Close the browser
	public void closeBrwoser() {
		if (!driver.toString().contains("null")) {
			driver.close();
		}
	}

	public static void main(String[] args) {

		// Calling the method using object
		UserDefinedMethod obj = new UserDefinedMethod();
		obj.Launchbrowser();
		obj.Login();
		obj.closeBrwoser();
		obj.Launchbrowser();
		obj.Login("admin", "admin@123");
		obj.closeBrwoser();
	}
}