package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeatureMasterActionPage extends BaseClass {
	public FeatureMasterActionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//i[@class='fa fa-pencil awesome'])[1]")
	private WebElement editFeature;

	@FindBy(xpath = "//input[@placeholder='Feature name']")
	private WebElement newFeatureMaster;
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement updateBtn;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okBtn;
	@FindBy(xpath = "(//i[@class='fa fa-trash'])[1]")
	private WebElement deleteFeature;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okBtn1;

	public WebElement getEditFeature() {
		return editFeature;
	}

	public WebElement getNewFeatureMaster() {
		return newFeatureMaster;
	}

	public WebElement getUpdateBtn() {
		return updateBtn;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public WebElement getDeleteFeature() {
		return deleteFeature;
	}

	public WebElement getOkBtn1() {
		return okBtn1;
	}

	public void editFeature(String NewFeature) throws Throwable {
		Thread.sleep(3000);
		click(editFeature);
		Thread.sleep(1000);
		clear(newFeatureMaster);
		sendKeys(newFeatureMaster, NewFeature);
		Thread.sleep(1000);
		click(updateBtn);
		Thread.sleep(1000);
		click(okBtn);
		Thread.sleep(3000);
	}

	public void deleteFeature() throws Throwable {
		click(deleteFeature);
		Thread.sleep(1000);
		click(okBtn1);
		Thread.sleep(1000);
	}

}
