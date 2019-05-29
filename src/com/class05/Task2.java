package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List <WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on the webpage is "+allLinks.size());
		Iterator<WebElement> it=allLinks.iterator();
		int count =0;
		while (it.hasNext()) {
			String linkText=it.next().getText();
			if (!linkText.isEmpty()) {
				count++;
			}
		}
		System.out.println("Number of links with text is "+count);
		driver.quit();
	}

}
