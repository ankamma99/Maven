package com.Automation.facebook.Mavenfacebook;

import org.testng.annotations.Test;


import ru.yandex.qatools.allure.annotations.Features;

public class Verifylogin extends webPage 
{
private Login obj=new Login();
	
	@Test(description = "verify invalid login error message")
	@Features("Login feature")
	public void signinverification() throws Exception{
	
	obj.enterUsername("ankamma");
		obj.enterPassword("123456");
		obj.clickOnSigninButton();
		obj.screen("screenshot1");
		
	}
}
