package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskTwoWithXPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("999-333-1133");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("444 Main street");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Apt 55G");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Vallew");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Wisconsin");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("53222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("222");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='register']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		

	}

}
