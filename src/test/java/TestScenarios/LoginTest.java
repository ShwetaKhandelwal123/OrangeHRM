package TestScenarios;


import org.testng.annotations.Test;

import BaseSuit.baseSuit;
import Pages.Admin;
import Pages.Login;

public class LoginTest {

	Admin ad = new Admin();
	Login login=new Login();
	
@Test(dataProvider="getvalue",dataProviderClass=baseSuit.class)

//here sheet1 is the name of excel sheet
public void Sheet1(String username,String password) 
{
	login.init();
	login.Sheet1(username, password);
	ad.admin();
}

}

