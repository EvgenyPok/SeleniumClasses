package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOneFecebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.className("inputtext")).sendKeys("grefe3246@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("filimoN1");
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Forgot")).click();
	driver.navigate().back();
	driver.findElement(By.id("u_0_2")).click();
	Thread.sleep(3000);
	driver.close();
	
	
	
}
	
	

}
