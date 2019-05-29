package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TCWebTable extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
			
	setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	String text = "Sortable Data Tables";
	driver.findElement(By.linkText(text)).click();
	//GET NUMBER OF ROWS
	
	List <WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
	System.out.println("Number of columns ="+cols.size());
	
	List <WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	System.out.println("Number of raws ="+rows.size());
	
	//printing headers
	Iterator<WebElement> it=cols.iterator();
	while (it.hasNext()) {
		System.out.println(it.next().getText());
	}
	//printing data from all rows
	for (WebElement row:rows) {
		System.out.println(row.getText());
	}
	Thread.sleep(3000);
	driver.quit();
}
}	
