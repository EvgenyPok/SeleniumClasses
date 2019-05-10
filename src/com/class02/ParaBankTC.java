package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Evgeny");
		driver.findElement(By.name("customer.lastName")).sendKeys("Pok");
		driver.findElement(By.id("customer.address.street")).sendKeys("100 Colfax");
		driver.findElement(By.name("customer.address.city")).sendKeys("Staten Island");
		driver.findElement(By.name("customer.address.state")).sendKeys("NY");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("100 Colfax");
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("347-444-5533");
		driver.findElement(By.id("customer.ssn")).sendKeys("466-67-56788");
		driver.findElement(By.id("customer.username")).sendKeys("evgenypok");
		driver.findElement(By.id("customer.password")).sendKeys("qwerty");
		driver.findElement(By.name("repeatedPassword")).sendKeys("qwerty");
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("evgenypok");
		driver.findElement(By.name("password")).sendKeys("qwerty");
		driver.findElement(By.className("button")).click();
		
	}

}
