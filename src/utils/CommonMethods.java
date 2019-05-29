package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	public static WebDriver driver;
	
	public static void selectOptionFromRadioButton(List<WebElement> elements, int option) {
		try {
			if (elements.size() >= (option)) {
				if (elements.get(option - 1).isDisplayed() && elements.get(option - 1).isEnabled()) {
					elements.get(option - 1).click();
				} else {
					System.out.println("Check if the option you chose is enabled");
				}
			} else {
				System.out.println(
						"There are total " + elements.size() + " options, and your " + option + " is not one of them");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
		
		public static void selectOptionsFromCheckBox(List<WebElement> elements, int[] options) {
		try {
			for (int i = 0; i < options.length; i++) {
				if (elements.get(options[i] - 1).isDisplayed() && elements.get(options[i] - 1).isEnabled()) {
					elements.get(options[i] - 1).click();
				} else {
					System.out.println("Check if the options you chose are enabled");
				}
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
		}
		
	}

	public static void selectValueFromDD(WebElement element, String text) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		boolean textWasFound = false;
		for (WebElement option : options) {
			String optionText = option.getText();
			if (optionText.equals(text)) {
				select.selectByVisibleText(text);
				textWasFound = true;
				break;
			}
		}
		if (!textWasFound) {
			System.out.println("Option with text "+text+" is not available");
		}
	}

    public static void selectValueFromDD(WebElement element, int index) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        if (options.size() > index) {
            select.selectByIndex(index);
        }else {
            System.out.println("Invalid index has been passed");
        }
    }
    
    public static void sendText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
    
    public static void setUpDriver(String browser, String url) {
    	
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("browser given is wrong");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
}