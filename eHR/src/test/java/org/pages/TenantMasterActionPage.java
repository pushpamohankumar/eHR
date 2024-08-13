package org.pages;

import java.io.File;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TenantMasterActionPage extends BaseClass {
	public TenantMasterActionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//i[@class='fa fa-pencil awesome'])[1]")
	private WebElement editTenant;
	@FindBy(xpath = "//button[@class='close']")
	private WebElement closeviwetenant;
	@FindBy(xpath = "(//i[@class='fa fa-eye awesome'])[1]")
	private WebElement viewTenant;
	@FindBy(xpath = "//input[@placeholder='Address2']")
	private WebElement addressTwo;
	@FindBy(xpath = "//input[@placeholder='Pin Code']")
	private WebElement pincode;
	@FindBy(xpath = "//button[text()='Update ']")
	private WebElement updateTenant;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okTenant;
	@FindBy(xpath = "(//i[@class='fa fa-cog'])[1]")
	private WebElement customization;
	@FindBy(xpath = "//button[text()='Upload']")
	private WebElement uploadimage;
	@FindBy(xpath = "//button[text()='Theme Setting']")
	private WebElement themeSetting;
	@FindBy(xpath = "(//i[@class='fi fi-sr-palette'])[4]")
	private WebElement menubar;
	@FindBy(xpath = "//select[@class='form-control ng-untouched ng-pristine ng-valid']")
	private WebElement positionofNavigationBar;
	@FindBy(xpath = "//option[text()='Bottom']")
	private WebElement bottom;
	@FindBy(xpath = "//button[text()='Submit ']")
	private WebElement submitBtn;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okBtn;

	@FindBy(xpath = "//button[text()='Table Setting']")
	private WebElement tableSettings;
	@FindBy(xpath = "(//span[@class='p-inputswitch-slider'])[19]")
	private WebElement serialNumber;
	@FindBy(xpath = "//button[text()='Submit ']")
	private WebElement submitBtnOne;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okBtnOne;

	@FindBy(xpath = "(//i[@class='fa fa-compress'])[4]")
	private WebElement extendPlanExpiry;
	@FindBy(xpath = "//input[@class='ng-tns-c54-5 p-inputtext p-component ng-star-inserted']")
	private WebElement extendedDate;
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitBtn2;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okBtn2;

	@FindBy(xpath = "(//i[@class='fa fa-file'])[1]")
	private WebElement accessPermission;
	@FindBy(xpath = "(//i[@class='fa fa-plus-circle'])[2]")
	private WebElement recruitment;
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[2]")
	private WebElement recruitmentCheckBox;
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[3]")
	private WebElement add;
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[4]")
	private WebElement read;
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[5]")
	private WebElement edit;
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[7]")
	private WebElement addOne;
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[7]")
	private WebElement editTwo;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;
//	@FindBy(xpath="//button[text()='Submit']")
//	private WebElement SubmitBtn3;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okBtnThree;

	@FindBy(xpath = "(//i[@class='fa fa-link'])[1]")
	private WebElement linkCopied;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okBtnFour;

	@FindBy(xpath = "(//i[@class='fa fa-id-card'])[1]")
	private WebElement roleAccess;
	@FindBy(xpath = "//input[@placeholder='Role Name']")
	private WebElement roleName;
	@FindBy(xpath = "//input[@placeholder='Role Description']")
	private WebElement roleDescription;
	@FindBy(xpath = "(//i[@class='fa fa-plus'])[2]")
	private WebElement addRole;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okRole;
	@FindBy(xpath = "(//i[@class='fa fa-plus'])[4]")
	private WebElement addPermission;
	@FindBy(xpath = "(//i[@class='fa fa-plus-circle'])[2]")
	private WebElement benefitsandPayroll;
//	@FindBy(xpath = "(//div[@class='p-checkbox p-component p-checkbox-checked'])[5]")
//	private WebElement salaryMasterEdit;
//	@FindBy(xpath = "(//div[@class='p-checkbox p-component p-checkbox-checked'])[6]")
//	private WebElement salaryMasterDelete;
//	@FindBy(xpath = "(//div[@class='p-checkbox p-component p-checkbox-checked'])[16]")
//	private WebElement EmployeeBankDetailsRead;
//	@FindBy(xpath = "(//div[@class='p-checkbox p-component p-checkbox-checked'])[18]")
//	private WebElement EmployeeBankDetailsDelete;
	@FindBy(xpath = "(//span[@class='p-checkbox-icon pi pi-check'])[5]")
	private WebElement editEtn;
	@FindBy(xpath = "(//span[@class='p-checkbox-icon pi pi-check'])12]")
	private WebElement checkbox;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveRolePermission;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okRoleAccess;
	@FindBy(xpath = "//span[text()='×']")
	private WebElement closeBtn;

	public WebElement getEditTenant() {
		return editTenant;
	}

	public WebElement getCloseviwetenant() {
		return closeviwetenant;
	}

	public WebElement getViewTenant() {
		return viewTenant;
	}

	public WebElement getAddressTwo() {
		return addressTwo;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getUpdateTenant() {
		return updateTenant;
	}

	public WebElement getOkTenant() {
		return okTenant;
	}

	public WebElement getCustomization() {
		return customization;
	}

	public WebElement getUploadimage() {
		return uploadimage;
	}

	public WebElement getThemeSetting() {
		return themeSetting;
	}

	public WebElement getMenubar() {
		return menubar;
	}

	public WebElement getPositionofNavigationBar() {
		return positionofNavigationBar;
	}

	public WebElement getBottom() {
		return bottom;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public WebElement getTableSettings() {
		return tableSettings;
	}

	public WebElement getSerialNumber() {
		return serialNumber;
	}

	public WebElement getSubmitBtnOne() {
		return submitBtnOne;
	}

	public WebElement getOkBtnOne() {
		return okBtnOne;
	}

	public WebElement getExtendPlanExpiry() {
		return extendPlanExpiry;
	}

	public WebElement getExtendedDate() {
		return extendedDate;
	}

	public WebElement getSubmitBtn2() {
		return submitBtn2;
	}

	public WebElement getOkBtn2() {
		return okBtn2;
	}

	public WebElement getAccessPermission() {
		return accessPermission;
	}

	public WebElement getRecruitment() {
		return recruitment;
	}

	public WebElement getRecruitmentCheckBox() {
		return recruitmentCheckBox;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getRead() {
		return read;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getAddOne() {
		return addOne;
	}

	public WebElement getEditTwo() {
		return editTwo;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getOkBtnThree() {
		return okBtnThree;
	}

	public WebElement getLinkCopied() {
		return linkCopied;
	}

	public WebElement getOkBtnFour() {
		return okBtnFour;
	}

	public WebElement getRoleAccess() {
		return roleAccess;
	}

	public WebElement getRoleName() {
		return roleName;
	}

	public WebElement getRoleDescription() {
		return roleDescription;
	}

	public WebElement getAddRole() {
		return addRole;
	}

	public WebElement getOkRole() {
		return okRole;
	}

	public WebElement getAddPermission() {
		return addPermission;
	}

	public WebElement getBenefitsandPayroll() {
		return benefitsandPayroll;
	}

	public WebElement getEditEtn() {
		return editEtn;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getSaveRolePermission() {
		return saveRolePermission;
	}

	public WebElement getOkRoleAccess() {
		return okRoleAccess;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public void tenantViewAction() throws Throwable {
		Thread.sleep(3000);
		click(viewTenant);
		Thread.sleep(3000);
		click(closeviwetenant);
		
	}

	public void tenantEditAction(String Addresstwo, String PinCode) throws InterruptedException {
		Thread.sleep(3000);
		click(editTenant);
		Thread.sleep(1000);
		clear(addressTwo);
		sendKeys(addressTwo, Addresstwo);
		Thread.sleep(1000);
		clear(pincode);
		sendKeys(pincode, PinCode);
		Thread.sleep(1000);
		click(updateTenant);
		Thread.sleep(1000);
		click(okTenant);
		Thread.sleep(3000);

	}

	public void tenantStatus() throws Throwable {
		click(customization);
		Thread.sleep(1000);
		click(themeSetting);
		Thread.sleep(1000);

		Actions a = new Actions(driver);
		a.moveToElement(positionofNavigationBar).click().perform();
		click(bottom);
		Thread.sleep(1000);
		click(submitBtn);
		Thread.sleep(1000);
		click(okBtn);
		Thread.sleep(1000);
		Thread.sleep(3000);
		click(customization);
		Thread.sleep(1000);
		click(tableSettings);
		Thread.sleep(1000);
		click(serialNumber);
		Thread.sleep(1000);
		click(submitBtnOne);
		Thread.sleep(1000);
		click(okBtnOne);
		Thread.sleep(3000);

	}

	public void extendPlanExpiry() throws Throwable {
		click(extendPlanExpiry);
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.doubleClick(extendedDate).click().perform();
		driver.findElement(By.xpath("//button[@class='p-ripple p-element p-datepicker-next p-link ng-tns-c54-5']"))
				.click();
		driver.findElement(By.xpath("//span[text()='30']")).click();
		Thread.sleep(1000);
		click(submitBtn2);
		Thread.sleep(1000);
		click(okBtn2);
		Thread.sleep(3000);

	}

	public void accessPermission() throws Throwable {
		click(accessPermission);
		Thread.sleep(1000);
		click(recruitment);
		Thread.sleep(3000);
		click(recruitmentCheckBox);
		Thread.sleep(3000);
		click(saveBtn);
		click(okBtnThree);
		Thread.sleep(3000);
	}

	public void link() throws Throwable {
		click(linkCopied);
		Thread.sleep(1000);
		click(okBtnFour);
		Thread.sleep(3000);
	}

	public void roleAccess(String RoleNameAccess, String RoleDescriptionAccess) throws Throwable {
		click(roleAccess);
		sendKeys(roleName, RoleNameAccess);
		Thread.sleep(500);
		sendKeys(roleDescription, RoleDescriptionAccess);
		Thread.sleep(500);
		click(addRole);
		Thread.sleep(500);
		click(okRole);
		Thread.sleep(500);
		click(addPermission);
		Thread.sleep(1000);
		click(benefitsandPayroll);
		Thread.sleep(1000);
		click(editEtn);
		Thread.sleep(1000);
		click(saveRolePermission);
		Thread.sleep(1500);
		click(okRoleAccess);
		Thread.sleep(2000);
		click(closeBtn);
		Thread.sleep(3000);
	}
}