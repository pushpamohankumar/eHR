package org.pages;


import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModuleMasterActionPage extends BaseClass{
	public ModuleMasterActionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//i[@class='fa fa-eye awesome'])[1]")
	private WebElement viewModuleMaster;
	
	@FindBy(xpath="//span[text()='×']")
	private WebElement closeModuleMaster;
	@FindBy(xpath="(//i[@class='fa fa-pencil awesome'])[1]")
	private WebElement editMasterModule;
	@FindBy(xpath="(//i[@class='fa fa-trash tdtrash mt-2'])[2]")
	private WebElement deleteone;
	@FindBy(xpath="//button[text()='Ok']")
	private WebElement okBtn;
	@FindBy(xpath="//button[text()='Update ']")
	private WebElement updateBtn;
	@FindBy(xpath="//button[text()='Ok']")
	private WebElement okBtn1;
	@FindBy(xpath="(//i[@class='fa fa-trash'])[1]")
	private WebElement deleteModuleMaster;
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancelMasterModule;
	
	
	
	public WebElement getViewModuleMaster() {
		return viewModuleMaster;
	}

	public void setViewModuleMaster(WebElement viewModuleMaster) {
		this.viewModuleMaster = viewModuleMaster;
	}

	public WebElement getCloseModuleMaster() {
		return closeModuleMaster;
	}

	public void setCloseModuleMaster(WebElement closeModuleMaster) {
		this.closeModuleMaster = closeModuleMaster;
	}

	public WebElement getEditMasterModule() {
		return editMasterModule;
	}

	public void setEditMasterModule(WebElement editMasterModule) {
		this.editMasterModule = editMasterModule;
	}

	public WebElement getDeleteone() {
		return deleteone;
	}

	public void setDeleteone(WebElement deleteone) {
		this.deleteone = deleteone;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public void setOkBtn(WebElement okBtn) {
		this.okBtn = okBtn;
	}

	public WebElement getUpdateBtn() {
		return updateBtn;
	}

	public void setUpdateBtn(WebElement updateBtn) {
		this.updateBtn = updateBtn;
	}

	public WebElement getOkBtn1() {
		return okBtn1;
	}

	public void setOkBtn1(WebElement okBtn1) {
		this.okBtn1 = okBtn1;
	}

	public WebElement getDeleteModuleMaster() {
		return deleteModuleMaster;
	}

	public void setDeleteModuleMaster(WebElement deleteModuleMaster) {
		this.deleteModuleMaster = deleteModuleMaster;
	}

	public WebElement getCancelMasterModule() {
		return cancelMasterModule;
	}

	public void setCancelMasterModule(WebElement cancelMasterModule) {
		this.cancelMasterModule = cancelMasterModule;
	}

	public void viewModuleMaster() throws Throwable {
		Thread.sleep(3000);
		click(viewModuleMaster);
		Thread.sleep(1000);
		click(closeModuleMaster);
		Thread.sleep(3000);
	}
	
	public void editMasterModule() throws Throwable {
		click(editMasterModule);
		Thread.sleep(1000);
		click(deleteone);
		Thread.sleep(1000);
		click(okBtn);
		Thread.sleep(1000);
		click(updateBtn);
		Thread.sleep(1000);
		click(okBtn1);
		Thread.sleep(3000);
		
	}
	public void deleteMasterModule() throws Throwable {
		click(deleteModuleMaster);
		Thread.sleep(1000);
		click(cancelMasterModule);
		
		
	}
}
