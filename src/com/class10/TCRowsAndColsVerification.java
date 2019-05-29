package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TCRowsAndColsVerification extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);
		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[id*='login']")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		String customerToVerify = "Susan McLaren";
		String customerUpdated = "Susan Mc Laren";
		for (int i=1;i<rows.size();i++) {
			String rowData=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]")).getText();
						
			if (rowData.contains(customerToVerify)) {
				driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td/input[@type='image']")).click();
				Thread.sleep(2000);
				WebElement name = driver.findElement(By.xpath("//input[contains(@id,'Name')]"));
				name.clear();
				Thread.sleep(1000);
				name.sendKeys(customerUpdated);
				Thread.sleep(1000);
				driver.findElement(By.linkText("Update")).click();
				rowData=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]")).getText();
				Thread.sleep(1000);
				if (rowData.contains(customerUpdated)) {
					System.out.println("Customer name Updated to "+customerUpdated);
				}else {
					System.out.println("Something went wrong while updating customers name");
				}
				break;
				
			}
					
		}
		Thread.sleep(2000);
		driver.close();	
}
	
}
