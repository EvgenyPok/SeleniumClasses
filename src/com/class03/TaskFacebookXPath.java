package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFacebookXPath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("grefe3246@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("filimoN1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
	Thread.sleep(2000);
	driver.close();
	
}
}
