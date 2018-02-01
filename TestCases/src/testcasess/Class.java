package testcasess;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	
	try{
	
	if (driver.findElement(By.linkText("Yahoo")).isDisplayed()){ //Looking for yahoo on google home page
		System.out.println("Passed");
	}
	}
	catch (NoSuchElementException e){
		System.out.println("Fail");//Expected to Fail
	}	
	}
}
