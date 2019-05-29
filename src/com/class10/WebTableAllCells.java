package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class WebTableAllCells extends CommonMethods{

	public static void main(String[] args) {
			
	setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	String text = "Challenging DOM";
	driver.findElement(By.linkText(text)).click();
	//GET NUMBER OF ROWS
	
	List <WebElement> allCells=driver.findElements(By.xpath("//table/tbody/tr/td"));
	
	for (WebElement cell:allCells) {
		System.out.println(cell.getText());
	}
	driver.close();
}
}	
