package com.naveenautomation.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.YourAffiliateInformationPage;
import com.naveenautomation.testbase.TestBase;

public class YourAffiliateInformationTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	YourAffiliateInformationPage yourAffiliateInfo;

	@BeforeMethod
	public void launchBrowser() {
		initialization();
		page = new AccountLoginPage();
	}

	@Test

	public void validateAffiliateAccountSignup() {
		myAccountPage = page.submitLogin("abcabc@gmail.com", "abcabc1");
		myAccountPage.goToAffiliateAccount();
		yourAffiliateInfo.SubmitInformation("bst essentials", "abc.com", "basilst");

//		Assert.assertEquals(, "Success: Your account has been successfully updated.");
	}

}
