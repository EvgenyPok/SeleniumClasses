package com.class07;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class iFrameTask extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	
	CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
	driver.switchTo().frame("iframe1");
	driver.findElement(By.xpath("//a[@href='http://toolsqa.com/postman-tutorial/']")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	if (driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed()) {
		System.out.println("Required webelement (Iterations) on iframe 2 is present. TC PASS");
	}else {
		System.out.println("Required webelement (Iterations) on iframe 2 is NOT present. TC FAIL");
	}
	driver.close();
	
	
	//h3[text()='Interactions']
}
}
