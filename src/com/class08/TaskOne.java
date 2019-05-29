package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

/*Task One
Ahead to http://uitestpractice.com/Students/Index
Click on the Actions
Click on the click me !
Handle the alert and click okay
Double Click Double Click Me !
Handle the alert and click okay
Close the browser
*/
public class TaskOne extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	setUpDriver("chrome", "http://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
	WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions action=new Actions(driver);
	action.contextClick(rightClick).perform();
	//driver.switchTo().frame(0);
	driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-delete']")).click();
	Alert alert1 = driver.switchTo().alert();
	Thread.sleep(2000);
	alert1.accept();
	Thread.sleep(1000);
	action.doubleClick(doubleClick).perform();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	driver.close();
}
}
