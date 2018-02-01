package testcasess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wiki {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new FirefoxDriver();
	driver.get("http://en.wikipedia.org/wiki/Selenium_(software)");
	driver.findElement(By.linkText("Create account")).click();
	Thread.sleep(3000);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	if (url.contains("wikipedia.org")){
		System.out.println("1st Case Passed");
	}
	else {
		System.out.println("1st Case Fail");
	}
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("seleniumhq.org")).click();
	Thread.sleep(2000);
	url = driver.getCurrentUrl();
	System.out.println(url);
	
	if (url.contains("seleniumhq.org")){
		System.out.println("2nd Case Passed");
	}
	else{
		System.out.println("2nd Case Fail");
	}
	driver.close();
	}
}