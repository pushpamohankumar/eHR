package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TenantAdminActionPage extends BaseClass {
	public TenantAdminActionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//img[@src='assets/images/tenant-master.png'])[2]")
	private WebElement tenantAdmin;
	@FindBy(xpath = "(//i[@class='fa fa-eye awesome'])[1]")
	private WebElement viewAdmin;
	@FindBy(xpath = "//span[text()='×']")
	private WebElement closeviewtenant;
	@FindBy(xpath = "(//i[@class='fa fa-envelope'])[1]")
	private WebElement adminMail;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement sentMail;
	@FindBy(xpath = "(//i[@class='fa fa-pencil'])[1]")
	private WebElement editAdmin;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastNameEdit;
	@FindBy(xpath = "//input[@placeholder='Phone Number(Alternate No)']")
	private WebElement adminAlternatePhNumber;
	@FindBy(xpath = "//button[text()='Update ']")
	private WebElement updateAdmin;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement adminSuccessful;
	@FindBy(xpath = "(//i[@class='fa fa-trash'])[1]")
	private WebElement deleteAdmin;
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancel;

	public WebElement getTenantAdmin() {
		return tenantAdmin;
	}

	public WebElement getViewAdmin() {
		return viewAdmin;
	}

	public WebElement getCloseviewtenant() {
		return closeviewtenant;
	}

	public WebElement getAdminMail() {
		return adminMail;
	}

	public WebElement getSentMail() {
		return sentMail;
	}

	public WebElement getEditAdmin() {
		return editAdmin;
	}

	public WebElement getLastNameEdit() {
		return lastNameEdit;
	}

	public WebElement getAdminAlternatePhNumber() {
		return adminAlternatePhNumber;
	}

	public WebElement getUpdateAdmin() {
		return updateAdmin;
	}

	public WebElement getAdminSuccessful() {
		return adminSuccessful;
	}

	public WebElement getDeleteAdmin() {
		return deleteAdmin;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public void viewAdmin() throws Throwable {
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(tenantAdmin).click().perform();
		Thread.sleep(1000);
		click(viewAdmin);
		Thread.sleep(1000);
		click(closeviewtenant);
		Thread.sleep(3000);
	}

	public void adminMail() throws Throwable {
		click(adminMail);
		Thread.sleep(3000);
		click(sentMail);
		Thread.sleep(3000);
	}

	public void adminEdit(String LastnameEditAdmin, String AdminAlterphNum) throws Throwable {
		click(editAdmin);
		Thread.sleep(1000);
		clear(lastNameEdit);
		sendKeys(lastNameEdit, LastnameEditAdmin);
		Thread.sleep(1000);
		clear(adminAlternatePhNumber);
		sendKeys(adminAlternatePhNumber, AdminAlterphNum);
		Thread.sleep(1000);
		click(updateAdmin);
		Thread.sleep(1000);
		click(adminSuccessful);
		Thread.sleep(3000);
	}

	public void deleteAdmin() throws Throwable {
		click(deleteAdmin);
		Thread.sleep(1000);
		click(cancel);
		Thread.sleep(3000);

	}
}
