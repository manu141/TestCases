package testcasess;

import org.openqa.selenium.By;

public class AdminLogin extends UserDefinedMethod{

	public static void main(String[] args) {
	//Create Object/Instance 
	AdminLogin object = new AdminLogin();
	object.Launchbrowser();
	object.Login("admin","admin@123");
	driver.findElement(By.linkText("Online Catalog")).click();
	String url = driver.getCurrentUrl();
	if (url.equals("http://www.gcrit.com/build3")){
		System.out.println("Passed");
	}
	else {
		System.out.println("Not Redirected- Fail");
	}
	object.closeBrwoser();
	}

}
