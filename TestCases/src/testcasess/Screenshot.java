package testcasess;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Application/Firefox.app/Con")
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//Sol1:
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String ds = System.getProperty("user.dir")+ "/test-output/screenshotvalue.png";
		File des = new File(ds);
		FileUtils.copyFile(source, des);
		driver.quit();
		
		//Sol2:
		//Ashot(); using ashot.jar file
	}
}
