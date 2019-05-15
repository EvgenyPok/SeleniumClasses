package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@class='btn_action']")).click();
	driver.close();
	
	
	
}
}
