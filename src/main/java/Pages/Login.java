package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseFunctions.Base;
import PageObject.OrangeHrmPO;

public class Login {

	Base base=new Base();

	public void init()
	{
       base.getLocalDriver();
		
		base.getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
    }
	public void Sheet1(String username,String password)
	{
		
	base.setValue(OrangeHrmPO.UserName,username);
	
	base.setValue(OrangeHrmPO.PassWord,password);

    base.click(OrangeHrmPO.LoginBtn);

}
}
