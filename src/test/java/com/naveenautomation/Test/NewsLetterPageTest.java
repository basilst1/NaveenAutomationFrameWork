package com.naveenautomation.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.NewsLetterpage;
import com.naveenautomation.testbase.TestBase;

public class NewsLetterPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	NewsLetterpage newsLetterPage;

	@BeforeMethod
	public void launchBrowser() {
		initialization();
		page = new AccountLoginPage();
	}

	@Test()
	public void validateUserCanAddNewAddress() {
		myAccountPage = page.submitLogin("abcabc@gmail.com", "abcabcabc");
		newsLetterPage = myAccountPage.clickNewsLetterItem("Newsletter");
		myAccountPage = newsLetterPage.clickContinue();

		String bannerText = newsLetterPage.getBannerText();
		Assert.assertEquals(bannerText, " Success: Your newsletter subscription has been successfully updated!");

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
