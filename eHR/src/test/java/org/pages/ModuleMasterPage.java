package org.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModuleMasterPage extends BaseClass {
	public ModuleMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//img[@src='assets/images/Modules.png'])[1]")
	private WebElement moduleMaster;
	
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement addModule;
	@FindBy(xpath = "//input[@placeholder='Module Name']")
	private WebElement moduleMasterName;
	@FindBy(xpath = "//input[@placeholder='Sub Module Name']")
	private WebElement subModuleName;
	@FindBy(xpath = "//i[@class='fa fa-plus-circle mt-2']")
	private WebElement add;
	@FindBy(xpath = "(//input[@placeholder='Sub Module Name'])[2]")
	private WebElement subModuleNameTwo;
	@FindBy(xpath = "(//i[@class='fa fa-plus-circle'])[2]")
	private WebElement addOne;
	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-valid ng-touched']")
	private WebElement selectFormOne;
	@FindBy(xpath = "//option[text()='Apply Leave']")
	private WebElement applyLeave;
	@FindBy(xpath = "(//i[@class='fa fa-plus-circle'])[2]")
	private WebElement addTwo;
	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-valid ng-touched']")
	private WebElement selectFormTwo;
	@FindBy(xpath = "(//option[text()='Add Target'])[2]")
	private WebElement addTarget;
	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-valid ng-touched']")
	private WebElement selectFormThree;
	@FindBy(xpath = "(//option[text()='Add Role")
	private WebElement addOffer;
	@FindBy(xpath = "(//input[@placeholder='Sub Module Name'])[3]")
	private WebElement subModuleThree;
	@FindBy(xpath = "(//i[@class='fa fa-plus-circle'])[3]")
	private WebElement addThree;
	@FindBy(xpath = "(//option[text()='Add Interview Details'])[3]")
	private WebElement addInterviewDetails;
	@FindBy(xpath = "//button[text()='Submit ']")
	private WebElement submitBtn;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okBtn;
	
	public WebElement getModuleMaster() {
		return moduleMaster;
	}

	public WebElement getAddModule() {
		return addModule;
	}

	public WebElement getModuleMasterName() {
		return moduleMasterName;
	}

	public WebElement getSubModuleName() {
		return subModuleName;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getSubModuleNameTwo() {
		return subModuleNameTwo;
	}

	public WebElement getAddOne() {
		return addOne;
	}

	public WebElement getSelectFormOne() {
		return selectFormOne;
	}

	public WebElement getApplyLeave() {
		return applyLeave;
	}

	public WebElement getAddTwo() {
		return addTwo;
	}

	public WebElement getSelectFormTwo() {
		return selectFormTwo;
	}

	public WebElement getAddTarget() {
		return addTarget;
	}

	public WebElement getSelectFormThree() {
		return selectFormThree;
	}

	public WebElement getAddOffer() {
		return addOffer;
	}

	public WebElement getSubModuleThree() {
		return subModuleThree;
	}

	public WebElement getAddThree() {
		return addThree;
	}

	public WebElement getAddInterviewDetails() {
		return addInterviewDetails;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public void moduleMaster(String ModuleName, String SubModuleMaster, String SubModuleNametwo, String SubmoduleThree)
			throws Throwable {
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(moduleMaster).click().perform();
		Thread.sleep(1000);
		click(addModule);
		Thread.sleep(1000);
		sendKeys(moduleMasterName, ModuleName);
		Thread.sleep(1000);
		sendKeys(subModuleName, SubModuleMaster);
		Thread.sleep(1000);
		click(add);
		Thread.sleep(1000);
		sendKeys(subModuleNameTwo, SubModuleNametwo);
		Thread.sleep(1000);
		click(addOne);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		click(applyLeave);
		Thread.sleep(1000);
		click(addTwo);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		click(addTarget);
		click(add);
		sendKeys(subModuleThree, SubmoduleThree);
		click(addThree);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		click(addInterviewDetails);
		Thread.sleep(1000);
		click(submitBtn);
		Thread.sleep(1000);
		click(okBtn);
		Thread.sleep(1000);

	}

}
