package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseFunctions.Base;
import PageObject.AdminPO;

public class Admin {

	Base base = new Base();
	
	public void admin() 
	{
		base.click(AdminPO.Admin);
		base.click(AdminPO.Add);
		//base.click(AdminPO.UserRole);
		base.pressdownKey(AdminPO.UserRole);
		base.selectvalueFromAutoSuggestionDropDown(AdminPO.UserRole, AdminPO.UserRoleDrpDwn, "Admin");
		base.selectvalueFromAutoSuggestionDropDown(AdminPO.EmployeeName, AdminPO.EmployeeNameDrpDwn, "Charlie");
        base.selectvalueFromAutoSuggestionDropDown(AdminPO.Status, AdminPO.StatusDrpDwn, "Enable");
	
	
	
	}
	
	
	
}