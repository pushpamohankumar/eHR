package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguageMasterPage extends BaseClass {
	public LanguageMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//img[@src='assets/images/support-details.png'])[1]")
	private WebElement languageMaster;

	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement addLanguage;
	@FindBy(xpath = "//input[@placeholder='Language name']")
	private WebElement languageName;
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitBtn;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okBtn;

	public WebElement getLanguageMaster() {
		return languageMaster;
	}

	public WebElement getAddLanguage() {
		return addLanguage;
	}

	public WebElement getLanguageName() {
		return languageName;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public void languageMaster(String Languagename) throws Throwable {
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(languageMaster).click().perform();
		Thread.sleep(1000);
		click(addLanguage);
		Thread.sleep(1000);
		sendKeys(languageName, Languagename);
		Thread.sleep(1000);
		click(submitBtn);
		Thread.sleep(1000);
		click(okBtn);

	}
}
