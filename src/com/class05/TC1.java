package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
/*TC 1: Swag Labs Positive login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter valid username and valid password and click login
Verify robot icon is displayed
Verify “Products” text is available next to the robot icon
 * 
 */
	public static void main(String[] args) {
		
		String userName="standard_user";
		String pwd="secret_sauce";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#user-name")).sendKeys(userName);
		driver.findElement(By.cssSelector("input#password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		if (driver.findElement(By.cssSelector("div.peek")).isDisplayed()) {
			System.out.println("Robot icon is displayed. TC PASS");
		}else {
			System.out.println("Robot icon is NOT displayed. TC FAIL");
		}
		String product = driver.findElement(By.cssSelector("div.product_label")).getText();
		if (product.equals("Products")) {
			System.out.println("“Products” text is available next to the robot icon");
		}else {
			System.out.println("“Products” text is NOT available next to the robot icon");
		}
		//driver.close();
		
		
		
	}
	
	
}
