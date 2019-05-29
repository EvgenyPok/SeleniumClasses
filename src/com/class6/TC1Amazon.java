package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Evgeny\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement departmentsDD=driver.findElement(By.cssSelector("select.nav-search-dropdown"));
		Select select=new Select(departmentsDD);
		List<WebElement> allDept=select.getOptions();
		System.out.println("Total # of departments: "+allDept.size());
		for (WebElement we:allDept) {
			System.out.println(we.getText());
		}
		select.selectByVisibleText("Computers");
		Thread.sleep(2000);
		driver.quit();
	}

}
