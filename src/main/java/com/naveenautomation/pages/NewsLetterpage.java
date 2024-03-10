package com.naveenautomation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.testbase.TestBase;

public class NewsLetterpage extends TestBase {

	public NewsLetterpage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@type='radio'][@value='1']")
	WebElement clickRadioBtn;

	@FindBy(xpath = "//*[@type='submit'][@value='Continue']")
	WebElement continueBtn;

	@FindBy(css = "div.alert>i")
	WebElement alertNewsLetterBanner;

	public void clickRadioBtn() {
		clickRadioBtn.click();
	}

	public MyAccountPage clickContinue() {
		continueBtn.click();
		return null;
	}

	public String getBannerText() {
		// TODO Auto-generated method stub
		return alertNewsLetterBanner.getText();

	}

}
