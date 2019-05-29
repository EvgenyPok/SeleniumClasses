package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class doubleClick extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	setUpDriver("chrome", "https://www.saucedemo.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("sause_user");
	Actions action = new Actions(driver);
	action.contextClick(driver.findElement(By.cssSelector("input#password")));
	Thread.sleep(2000);
	action.doubleClick(driver.findElement(By.cssSelector("input#password"))).perform();
	Thread.sleep(2000);
	driver.close();
}
}
