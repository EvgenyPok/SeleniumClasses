package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2 {

	public static void main(String[] args) throws InterruptedException {
	/*TC 2: Select and Deselect values
Open chrome browser
Go to “http://uitestpractice.com/”
Click on “Select” tab
Verify how many options available in the first drop down and then select “United states of America”
Verify how many options available in the second drop down and then select all.
Deselect China from the second drop down
Quit browser (edited) 
*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("select")).click();
		WebElement firstDD=driver.findElement(By.cssSelector("select#countriesSingle"));
		Select select=new Select(firstDD);
		List<WebElement> firstDDOptions=select.getOptions();
		System.out.println("how many options available in the first drop down:"+firstDDOptions.size());
		select.selectByVisibleText("United states of America");
		Thread.sleep(2000);
		
		WebElement secondDD=driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select select1=new Select(secondDD);
		List<WebElement> secondDDOptions=select1.getOptions();
		System.out.println("how many options available in the second drop down:"+secondDDOptions.size());
		if (select1.isMultiple()) {
				for (int i=0;i<secondDDOptions.size();i++) {
					select1.selectByIndex(i);
				}
		Thread.sleep(2000);		
		}
		select1.deselectByVisibleText("China");
		Thread.sleep(2000);		
		driver.quit();
		
	}

}
