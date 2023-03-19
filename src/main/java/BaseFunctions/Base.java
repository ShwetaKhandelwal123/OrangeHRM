package BaseFunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Base {

public static WebDriver driver;
	
	public void getLocalDriver() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumAll\\ChromeBrowserSetup\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	public void pressdownKey(By locator)
	{
	     driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
	}
	
	public void pressDownKeyAndClick(By locator) throws InterruptedException
	{
		WebElement element=driver.findElement(locator);
		element.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		element.click();
	}

	
	public void selectvalueFromAutoSuggestionDropDown(By dropdownLoc, By suggestionLoc,String value) 
	{
		driver.findElement(dropdownLoc).sendKeys(value);
		
		List<WebElement> suggestions =driver.findElements(suggestionLoc);
		
		for (WebElement suggestion :suggestions)
		{
			if (suggestion.getText().contains(value))
			{
				suggestion.click();
			}
		}
	}
	
	public void setValue(By locator,String input)
	{
		driver.findElement(locator).sendKeys(input);
	}

	public void getUrl(String url)
	{
		driver.get(url);
	}
	public void click(By locator)
	{
		driver.findElement(locator).click();
	}
	
}
