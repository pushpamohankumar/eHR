package org.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTenantPage extends BaseClass {
	public AddTenantPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='btn bn backcolor']")
	private WebElement addTenant;
	@FindBy(xpath = "//input[@placeholder='Organization Name']")
	private WebElement organizationName;
	@FindBy(xpath = "//input[@placeholder='Address1']")
	private WebElement addressOne;
	@FindBy(xpath = "//input[@placeholder='Address2']")
	private WebElement addressTwo;
	@FindBy(xpath = "//span[@class='ng-tns-c51-2 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']")
	private WebElement country;
	@FindBy(xpath = "//span[text()='India']")
	private WebElement countryname;
	@FindBy(xpath = "//span[@class='ng-tns-c51-3 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']")
	private WebElement state;
	@FindBy(xpath = "//span[text()='Karnataka']")
	private WebElement stateName;
	@FindBy(xpath = "//span[@class='ng-tns-c51-4 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']")
	private WebElement city;
	@FindBy(xpath = "//span[text()='Bommanahalli']")
	private WebElement cityName;
	@FindBy(xpath = "//input[@placeholder='Pin Code']")
	private WebElement pinCode;
	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-valid ng-touched']")
	private WebElement plan;
	@FindBy(xpath = "//option[text()=' Gold']")
	private WebElement planTrail;
	@FindBy(xpath = "//select[@class='form-control ng-untouched ng-pristine ng-valid']")
	private WebElement planByMonthorYear;
	@FindBy(xpath = "//option[text()='Year']")
	private WebElement month;
	@FindBy(xpath = "//button[text()='Submit ']")
	private WebElement submitBtn;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement ok;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastName;
	@FindBy(xpath = "//div[@class='p-multiselect-label ng-tns-c48-5 p-placeholder']")
	private WebElement organizationNameOne;
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[1]")
	private WebElement cycle;
	@FindBy(xpath = "//input[@placeholder='Customer Email']")
	private WebElement customerEmail;
	@FindBy(xpath = "//input[@placeholder='Phone Number']")
	private WebElement phoneNumber;
	@FindBy(xpath = "//input[@placeholder='Phone Number(Alternate No)']")
	private WebElement alternatePhoneNumber;
	@FindBy(xpath = "//input[@placeholder='Address1']")
	private WebElement addressoneAdmin;
	@FindBy(xpath = "//input[@placeholder='Address2']")
	private WebElement addresstwoAdmin;
	@FindBy(xpath = "//span[@class='ng-tns-c51-6 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']")
	private WebElement countryAdmin;
	@FindBy(xpath = "//span[text()='India']")
	private WebElement indiaAdmin;
	@FindBy(xpath = "//span[@class='ng-tns-c51-7 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']")
	private WebElement stateAdmin;
	@FindBy(xpath = "//span[text()='Karnataka']")
	private WebElement stateNameAdmin;
	@FindBy(xpath = "//span[@class='ng-tns-c51-8 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']")
	private WebElement cityAdmin;
	@FindBy(xpath = "//span[text()='Bommanahalli']")
	private WebElement cityNameAdmin;
	@FindBy(xpath = "//input[@placeholder='Pin Code']")
	private WebElement pinCodeAdmin;
	@FindBy(xpath = "//button[text()='Submit ']")
	private WebElement saveBtnAdmin;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okAdmin;

	@FindBy(xpath = "//input[@placeholder='Role Name']")
	private WebElement roleName;
	@FindBy(xpath = "//input[@placeholder='Role Description']")
	private WebElement roleDescription;
	@FindBy(xpath="(//i[@class='fa fa-plus'])[2]")
	private WebElement addRole;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okRole;
	@FindBy(xpath = "(//i[@class='fa fa-plus'])[4]")
	private WebElement addPermission;
	@FindBy(xpath = "(//i[@class='fa fa-plus-circle'])[2]")
	private WebElement benefitsandPayroll;
	@FindBy(xpath = "(//div[@class='p-checkbox p-component p-checkbox-checked'])[5]")
	private WebElement salaryMasterEdit;
	@FindBy(xpath = "(//div[@class='p-checkbox p-component p-checkbox-checked'])[6]")
	private WebElement salaryMasterDelete;
	@FindBy(xpath = "(//div[@class='p-checkbox p-component p-checkbox-checked'])[16]")
	private WebElement employeeBankDetailsRead;
	@FindBy(xpath = "(//div[@class='p-checkbox p-component p-checkbox-checked'])[18]")
	private WebElement employeeBankDetailsDelete;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveRolePermission;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okRoleAccess;
	@FindBy(xpath="//span[text()='×']")
	private WebElement closeBtn;


	public WebElement getAddTenant() {
		return addTenant;
	}

	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getAddressOne() {
		return addressOne;
	}

	public WebElement getAddressTwo() {
		return addressTwo;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCountryname() {
		return countryname;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getStateName() {
		return stateName;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getPlan() {
		return plan;
	}

	public WebElement getPlanTrail() {
		return planTrail;
	}

	public WebElement getPlanByMonthorYear() {
		return planByMonthorYear;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getOk() {
		return ok;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getOrganizationNameOne() {
		return organizationNameOne;
	}

	public WebElement getCycle() {
		return cycle;
	}

	public WebElement getCustomerEmail() {
		return customerEmail;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getAlternatePhoneNumber() {
		return alternatePhoneNumber;
	}

	public WebElement getAddressoneAdmin() {
		return addressoneAdmin;
	}

	public WebElement getAddresstwoAdmin() {
		return addresstwoAdmin;
	}

	public WebElement getCountryAdmin() {
		return countryAdmin;
	}

	public WebElement getIndiaAdmin() {
		return indiaAdmin;
	}

	public WebElement getStateAdmin() {
		return stateAdmin;
	}

	public WebElement getStateNameAdmin() {
		return stateNameAdmin;
	}

	public WebElement getCityAdmin() {
		return cityAdmin;
	}

	public WebElement getCityNameAdmin() {
		return cityNameAdmin;
	}

	public WebElement getPinCodeAdmin() {
		return pinCodeAdmin;
	}

	public WebElement getSaveBtnAdmin() {
		return saveBtnAdmin;
	}

	public WebElement getOkAdmin() {
		return okAdmin;
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

	public WebElement getSalaryMasterEdit() {
		return salaryMasterEdit;
	}

	public WebElement getSalaryMasterDelete() {
		return salaryMasterDelete;
	}

	public WebElement getEmployeeBankDetailsRead() {
		return employeeBankDetailsRead;
	}

	public WebElement getEmployeeBankDetailsDelete() {
		return employeeBankDetailsDelete;
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

	public void addTenant(String Organizationname, String Addressone, String Addresstwo, String Pincode)
			throws Throwable {
		Thread.sleep(3000);
		click(addTenant);
		Thread.sleep(400);
		sendKeys(organizationName, Organizationname);
		Thread.sleep(400);
		sendKeys(addressOne, Addressone);
		Thread.sleep(400);
		sendKeys(addressTwo, Addresstwo);
		Thread.sleep(400);
		click(country);
		Thread.sleep(400);
		click(countryname);
		Thread.sleep(400);
		click(state);
		Thread.sleep(400);
		click(stateName);
		Thread.sleep(400);
		click(city);
		Thread.sleep(400);
		click(cityName);
		Thread.sleep(400);
		sendKeys(pinCode, Pincode);
		Thread.sleep(400);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		click(planTrail);
		Thread.sleep(400);
		click(planByMonthorYear);
		Thread.sleep(400);
		click(month);
		Thread.sleep(500);
		click(submitBtn);
		Thread.sleep(3000);
		click(ok);
		Thread.sleep(1500);

	}

	public void tenantAdmin(String FirstNameAdmin, String LastNameAdmin, String AdminCustomerEmail,
			String AdminPhoneNumber, String AdminAlternatePhoneNumber, String AdminAddressOne, String AdminAddressTwo,
			String AdminPinCode) throws Throwable {
		Thread.sleep(1500);
		sendKeys(firstName,FirstNameAdmin);
		Thread.sleep(300);
		sendKeys(lastName, LastNameAdmin);
		Thread.sleep(300);
		click(organizationNameOne);
		Thread.sleep(300);
		click(cycle);
		Thread.sleep(300);
		click(customerEmail);
		sendKeys(customerEmail, AdminCustomerEmail);
		Thread.sleep(300);
		sendKeys(phoneNumber, AdminPhoneNumber);
		Thread.sleep(300);
		sendKeys(alternatePhoneNumber, AdminAlternatePhoneNumber);
		Thread.sleep(300);
		sendKeys(addressoneAdmin, AdminAddressOne);
		Thread.sleep(300);
		sendKeys(addresstwoAdmin, AdminAddressTwo);
		Thread.sleep(300);
		click(countryAdmin);
		Thread.sleep(300);
		click(indiaAdmin);
		Thread.sleep(300);
		click(stateAdmin);
		Thread.sleep(300);
		click(stateNameAdmin);
		Thread.sleep(300);
		click(cityAdmin);
		Thread.sleep(300);
		click(cityNameAdmin);
		Thread.sleep(300);
		sendKeys(pinCodeAdmin, AdminPinCode);
		Thread.sleep(300);
		click(saveBtnAdmin);
		Thread.sleep(3000);
		click(okAdmin);
		Thread.sleep(3000);
	}

	public void roleAccess(String RoleNameAccess, String RoleDescriptionAccess) throws Throwable {
		Thread.sleep(2000);
		sendKeys(roleName, RoleNameAccess);
		Thread.sleep(500);
		sendKeys(roleDescription, RoleDescriptionAccess);
		Thread.sleep(500);
		click(addRole);
		Thread.sleep(500);
		click(okRole);
		Thread.sleep(500);
		click(addPermission);
		Thread.sleep(500);
		click(benefitsandPayroll);
		Thread.sleep(500);
		click(salaryMasterEdit);
		Thread.sleep(500);
		click(salaryMasterDelete);
		Thread.sleep(500);
		click(employeeBankDetailsRead);
		Thread.sleep(500);
		click(employeeBankDetailsDelete);
		Thread.sleep(500);
		click(saveRolePermission);
		Thread.sleep(500);
		click(okRoleAccess);
		Thread.sleep(2000);
		click(closeBtn);
		Thread.sleep(3000);
	}

}
