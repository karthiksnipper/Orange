package org.juit;
import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")
private WebElement textusername;
@FindBy(id="password")
private WebElement txtpassword;
@FindBy(xpath="//input[@type='Submit']")
private WebElement btnlogin;

@FindBy(id ="username_show")
private WebElement txtWelcome;


public WebElement getTextusername() {
	return textusername;
}
public WebElement getTxtpassword() {
	return txtpassword;
}
public WebElement getBtnlogin() {
	return btnlogin;
}
public WebElement getTxtWelcome() {
	return txtWelcome;
}

public void firstLogin(String username, String password ) throws IOException {
	
	elementSendkeys(getTextusername(), getDataFromCell("datas", rownum, cellnum));

//	String userText = getDataFromCell("datas", 2, 0);
	
//	String passText = getDataFromCell("datas", 2, 1);
	
}


}