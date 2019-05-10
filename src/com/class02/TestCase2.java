package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.syntaxtechs.com/");
	
	driver.navigate().to("https://www.google.com");
	driver.navigate().back();
	driver.navigate().refresh();
	System.out.println(driver.getCurrentUrl());
	String url=driver.getCurrentUrl();
	if (url.contains("Syntax".toLowerCase())) {
		System.out.println("You returned back to Syntax homepage");
	}else {
		System.out.println("You got lost during navigation");
	}
	driver.quit();
}
}
