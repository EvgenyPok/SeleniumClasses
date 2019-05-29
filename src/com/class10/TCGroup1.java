package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TCGroup1 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		String url="http://uitestpractice.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("Form")).click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.cssSelector("input#firstname"));
		WebElement lastName = driver.findElement(By.cssSelector("input#lastname"));
		WebElement countryDD = driver.findElement(By.cssSelector("select#sel1"));
		List<WebElement> maritalStatus = driver.findElements(By.name("optradio"));
		List<WebElement> hobby = driver.findElements(By.xpath("//input[@type='checkbox']"));
		WebElement phone = driver.findElement(By.cssSelector("input#phonenumber"));
		WebElement userName = driver.findElement(By.cssSelector("input#username"));
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		WebElement comment = driver.findElement(By.cssSelector("textarea#comment"));
		WebElement password = driver.findElement(By.cssSelector("input#pwd"));
		
		
		sendText(firstName, "John");
		sendText(lastName, "Williams");
		sendText(phone, "9732201587");
		sendText(userName, "Username");
		sendText(email, "user@gmail.com");
		sendText(email, "user@gmail.com");
		sendText(comment, "I am the best tester");
		sendText(password, "qwerty");
		
		selectOptionFromRadioButton(maritalStatus, 1);
		
		int[] hobbyOptions = {1,3};
		selectOptionsFromCheckBox(hobby, hobbyOptions);
				
		selectValueFromDD(countryDD, "Canada");
		
		//clicking the date element to open date Picker
		driver.findElement(By.cssSelector("input#datepicker")).click();
		
		WebElement month = driver.findElement(By.cssSelector("*.ui-datepicker-month"));
		selectValueFromDD(month, "Jul");
		
		WebElement year = driver.findElement(By.cssSelector("*.ui-datepicker-year"));
		selectValueFromDD(year, "1980");
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		String expectedDay = "18";
		
		for (WebElement el:allDates) {
			String day=el.getText();
			if (day.equals(expectedDay)) {
				el.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		Thread.sleep(3000);
		driver.close();
}
}
