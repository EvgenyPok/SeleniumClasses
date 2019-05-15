package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='text']")).sendKeys("problem_user");
	driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@value='LOGIN']")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
}


}
