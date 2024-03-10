package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.testbase.TestBase;

public class YourAffiliateInformationPage extends TestBase {

	public YourAffiliateInformationPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='content']/h1")
	WebElement myAffiliateAccountText;

	@FindBy(id = "input-company")
	WebElement company;

	@FindBy(id = "input-website")
	WebElement website;

	@FindBy(id = "input-cheque")
	WebElement chequePayee;

	@FindBy(xpath = "//*[@name='agree']")
	WebElement agreeBtn;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement submitBtn;

	public void companyName() {
		company.sendKeys("bst essential");
	}

	public void websiteId() {
		website.sendKeys("www.bst.com");

	}

	public void chequePayeeInfo() {
		chequePayee.sendKeys("Basilst thomas");
	}

	public String getAffiliateAccountText() {
		return myAffiliateAccountText.getText();

	}

	public void submitBtn() {
		submitBtn.click();
	}

	public void agreeBtn() {
		agreeBtn.click();
	}

}
