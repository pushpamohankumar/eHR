package org.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlanModuleColumnWise extends BaseClass{
	public PlanModuleColumnWise(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@src='assets/images/plan-module.png']")
	private WebElement planModule;
	
	

	public void setOkBtn(WebElement okBtn) {
		this.okBtn = okBtn;
	}
	@FindBy(xpath="(//i[@class='fa fa-edit editicon'])[2]")
	private WebElement silver;
	@FindBy(xpath="//div[@class='p-multiselect-label ng-tns-c43-9 p-placeholder']")
	private WebElement leaveApplicationForm;
	@FindBy(xpath="(//div[@class='p-checkbox-box'])[1]")
	private WebElement emailNotification;
	@FindBy(xpath="(//div[@class='p-checkbox-box'])[3]")
	private WebElement users;
	@FindBy(xpath="//button[text()='Update']")
	private WebElement updateBtn;
	@FindBy(xpath="//button[text()='Ok']")
	private WebElement okBtn;
	
public WebElement getPlanModule() {
		return planModule;
	}

	public WebElement getSilver() {
		return silver;
	}

	public WebElement getLeaveApplicationForm() {
		return leaveApplicationForm;
	}

	public WebElement getEmailNotification() {
		return emailNotification;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getUpdateBtn() {
		return updateBtn;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

public void planModuleColumnWise() throws Throwable {
	Thread.sleep(3000);
	Actions a = new Actions(driver);
	a.moveToElement(planModule).click().perform();
	Thread.sleep(1000);
	click(silver);
	Thread.sleep(1000);
	click(leaveApplicationForm);
	Thread.sleep(1000);
	click(emailNotification);
	Thread.sleep(1000);
	click(users);
	Thread.sleep(1000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	click(updateBtn);
	Thread.sleep(15000);
	click(okBtn);
	
	
	
	
}
}