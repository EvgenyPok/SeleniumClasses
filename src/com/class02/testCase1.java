package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https:\\amazon.com");
	System.out.println(driver.getTitle());
	String title = driver.getTitle();
	if (title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
		System.out.println("The title is correct");
	}else {
		System.out.println("The title is wrong");
	}
	driver.close();
}
}
