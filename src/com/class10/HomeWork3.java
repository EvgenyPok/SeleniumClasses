package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class HomeWork3 extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
	String url = "https://the-internet.herokuapp.com/";
	setUpDriver("chrome", url);
	String text = "Dynamic Controls";
	driver.findElement(By.linkText(text)).click();
	String buttonXPath = "//button[text()='Enable']";
	driver.findElement(By.xpath(buttonXPath)).click();
	
	// 1 way
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Disable']")));
	String textToEnter= "Hello";
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textToEnter);
	
	String returnedText=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
	if (returnedText.equals(textToEnter)) {
		System.out.println("Returned text equals to Entered");
	}else {
		System.out.println("Returned text:"+returnedText+" NOT equals to Entered.");
	}
	
	//2 way
	WebElement el = driver.findElement(By.xpath("//input[@type='text']"));
	wait.until(ExpectedConditions.elementToBeClickable(el));
	el.sendKeys(textToEnter);
	System.out.println(el.getAttribute("value"));
	
	Thread.sleep(2000);
	driver.quit();
}

}
