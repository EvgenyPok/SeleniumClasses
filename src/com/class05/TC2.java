package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
/*TC 2: Swag Labs Negative login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter invalid username and password and click login
Verify error message contains: “Username and password do not match any user in this service”
 */
	public static void main(String[] args) {
		
	
	String userName="standard_user1";
	String pwd="secret_sauce1";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input#user-name")).sendKeys(userName);
	driver.findElement(By.cssSelector("input#password")).sendKeys(pwd);
	driver.findElement(By.cssSelector("input.btn_action")).click();
	WebElement element = driver.findElement(By.xpath("//h3[@data-test='error']"));
	String toVerify="Username and password do not match any user in this service";
	if (element.getText().contains(toVerify)) {
		System.out.println("Error message contains the required text. TC PASS");
	}else {
		System.out.println("Error message WRONG. TC FAIL");
	}
	driver.quit();
}
}	
