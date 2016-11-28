package com.Automation.facebook.Mavenfacebook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import ru.yandex.qatools.allure.annotations.Step;

public class Login extends webPage
{
	
	private By email = By.id("email");
    private By password = By.id("pass");
    private By signinButton = By.id("u_0_n");
    
    
    @Step("Enter username")
    public void enterUsername(String enterUsername) {
        sendKeys(email, enterUsername);
    }
    
    @Step("Enter Password")
    public void enterPassword(String enterPasword) {
        sendKeys(password, enterPasword);
    }
    
   

	@Step("Click on signin button")
    public void clickOnSigninButton() {
        clickOn(signinButton);
    }


	
}
