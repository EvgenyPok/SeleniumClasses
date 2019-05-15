package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("john");
		driver.findElement(By.name("lastName")).sendKeys("Doe");
		driver.findElement(By.name("phone")).sendKeys("911");
		driver.findElement(By.id("userName")).sendKeys("test123@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("123 No Street");
		driver.findElement(By.name("city")).sendKeys("Denver");
		driver.findElement(By.name("state")).sendKeys("CO");
		driver.findElement(By.name("postalCode")).sendKeys("12345");
		driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("confirmPassword")).sendKeys("123");
		driver.findElement(By.name("register")).click();
		
		
	}

}
