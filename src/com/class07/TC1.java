package com.class07;

import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class TC1 extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	String url = "https://the-internet.herokuapp.com/";
	setUpDriver("chrome", url);
	Thread.sleep(1000);
	driver.findElement(By.linkText("Multiple Windows")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Elemental Selenium")).click();
	Thread.sleep(1000);
	String expectedTitle="Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
	Set<String> allWindows = driver.getWindowHandles();
	String parent = driver.getWindowHandle();
	String child="";
	System.out.println("Total # of windows open is "+allWindows.size());
	for (String window:allWindows) {
		if (!window.equals(parent)) {
			child=window;
		} 
	}
	driver.switchTo().window(child);
	Thread.sleep(1000);
	if (expectedTitle.equals(driver.getTitle())){
		System.out.println("Child window title is as expected: "+expectedTitle);
	}else {
		System.out.println("Child window title is NOT as expected");
	}
	driver.close();
	driver.switchTo().window(parent);
	Thread.sleep(1000);
	driver.findElement(By.linkText("Click Here")).click();
	allWindows = driver.getWindowHandles();
	expectedTitle="New Window";
	for (String window:allWindows) {
		if (!window.equals(parent)) {
			child=window;
		} 
	}
	driver.switchTo().window(child);
	Thread.sleep(1000);
	if (expectedTitle.equals(driver.getTitle())){
		System.out.println("Child window title is as expected: "+expectedTitle);
	}else {
		System.out.println("Child window title is NOT as expected "+driver.getTitle());
	}
	driver.close();
	driver.switchTo().window(parent);
	expectedTitle="The Internet";
	if (expectedTitle.equals(driver.getTitle())){
		System.out.println("Child window title is as expected: "+expectedTitle);
	}else {
		System.out.println("Child window title is NOT as expected "+driver.getTitle());
	}
	Thread.sleep(1000);
	driver.close();
	
}
}
