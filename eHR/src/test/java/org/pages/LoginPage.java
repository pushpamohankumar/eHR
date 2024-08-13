package org.pages;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@id='username']")
private WebElement username;
@FindBy(xpath="//input[@id='password']")
private WebElement password;
@FindBy(xpath="//button[@id='logged']")
private WebElement start;
@FindBy(xpath="//button[text()='Ok']")
private WebElement okBtn;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getStart() {
	return start;
}

public WebElement getOkBtn() {
	return okBtn;
}

public void login(String UserName,String PassWord) throws Throwable {
	Thread.sleep(2000);
	sendKeys(username, UserName);
	Thread.sleep(1000);
	sendKeys(password, PassWord);
	Thread.sleep(1000);
	click(start);
	click(okBtn);
	
}
}
