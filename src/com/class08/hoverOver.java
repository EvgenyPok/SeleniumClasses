package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class hoverOver extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement hoverOver = driver.findElement(By.xpath("//span[text()='Tutorial']"));
		Actions action = new Actions(driver);
		action.moveToElement(hoverOver).click().perform();
		driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
