package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.testbase.TestBase;

public class YourAffiliateInformationPage extends TestBase {

	MyAccountPage myAccountPage;

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

	public void companyName(String companyname) {
		company.sendKeys("company name");
	}

	public void websiteId(String website) {
		this.website.sendKeys("website");

	}

	public void chequePayeeInfo(String name) {
		chequePayee.sendKeys("name");
	}

	public String getAffiliateAccountText() {
		return myAffiliateAccountText.getText();

	}

	public void agreeBtn() {
		agreeBtn.click();
	}

	public void submitBtn() {
		submitBtn.click();
	}

	public void SubmitInformation(String companyname, String website, String name) {

		companyName(companyname);
		websiteId(website);
		chequePayeeInfo(name);
		submitBtn.click();

	}

}
