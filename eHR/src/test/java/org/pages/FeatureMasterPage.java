package org.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeatureMasterPage extends BaseClass {
	public FeatureMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='assets/images/plans-features.png']")
	private WebElement featureMaster;

	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement addFeature;
	@FindBy(xpath = "//input[@placeholder='Feature name']")
	private WebElement featureName;
	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-invalid ng-touched']")
	private WebElement featureType;
	@FindBy(xpath = "//option[text()='Radio']")
	private WebElement radio;
	@FindBy(xpath = "//select[@class='form-control ng-untouched ng-pristine ng-invalid']")
	private WebElement level;
	@FindBy(xpath = "//option[text()='Plan level']")
	private WebElement planlevel;
	@FindBy(xpath = "//div[@class='p-multiselect-label ng-tns-c48-3 p-placeholder']")
	private WebElement plan;
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[1]")
	private WebElement trial;
	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[2]")
	private WebElement silver;
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitBtn;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okbtn;

	public WebElement getFeatureMaster() {
		return featureMaster;
	}

	public WebElement getAddFeature() {
		return addFeature;
	}

	public WebElement getFeatureName() {
		return featureName;
	}

	public WebElement getFeatureType() {
		return featureType;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getLevel() {
		return level;
	}

	public WebElement getPlanlevel() {
		return planlevel;
	}

	public WebElement getPlan() {
		return plan;
	}

	public WebElement getTrial() {
		return trial;
	}

	public WebElement getSilver() {
		return silver;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getOkbtn() {
		return okbtn;
	}

	public void featureMasterModule(String Featurename) throws Throwable {
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(featureMaster).click().perform();
		Thread.sleep(1000);
		click(addFeature);
		Thread.sleep(1000);
		sendKeys(featureName, Featurename);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		click(radio);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		click(planlevel);
		Thread.sleep(1000);
		click(plan);
		Thread.sleep(500);
		click(trial);
		Thread.sleep(500);
		click(silver);
		r.keyPress(KeyEvent.VK_TAB);
		click(submitBtn);
		Thread.sleep(500);
		click(okbtn);
		Thread.sleep(1500);

	}

}
