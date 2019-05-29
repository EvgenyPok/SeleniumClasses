package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
/*HW for all of you:

TC 1: Tools QA check all elements
Open chrome browser
Go to “https://www.toolsqa.com/automation-practice-form/”
Fill out:
First Name
Last Name
Check that sex radio buttons are enabled and select “Male”
Check all Years of Experience radio buttons are clickable
Date
Select both checkboxes for profession
Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
Quit browser
*/
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Evgeny");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pokrovskiy");
	List<WebElement> radio=driver.findElements(By.name("sex"));
	for(WebElement we:radio) {
		System.out.println(we.isEnabled());
		if (we.getAttribute("Value").equals("Male")) {
			we.click();
		}
	}
	
	List<WebElement> expYears=driver.findElements(By.xpath("//input[@name='exp']"));
	Iterator<WebElement> it=expYears.iterator();
	System.out.println("Total options for years of experience: "+expYears.size());
	while (it.hasNext()) {
		it.next().click();
	}
	driver.findElement(By.cssSelector("input#datepicker")).sendKeys("04/05/2019");
	Thread.sleep(3000);
	driver.quit();
}
}	
