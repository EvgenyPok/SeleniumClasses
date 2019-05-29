package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Windows extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
	String parent= driver.getTitle();
	String parentID = driver.getWindowHandle();
	System.out.println("parent title: "+parent+" parent ID: "+parentID);
	
	driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
	Set<String> allWindows =driver.getWindowHandles();
	Iterator <String> it = allWindows.iterator();
	parentID = it.next();
	String childID = it.next();
	driver.switchTo().window(childID);
	String child=driver.getTitle();
	System.out.println("child title: "+child+" child ID: "+childID);
	driver.switchTo().window(parentID);
	driver.close();
	driver.switchTo().window(childID);
	Thread.sleep(1000);
	driver.close();
	
	
	
	
}
}
