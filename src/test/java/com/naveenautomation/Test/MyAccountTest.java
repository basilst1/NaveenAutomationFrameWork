package com.naveenautomation.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ChangePwdPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.testbase.TestBase;

public class MyAccountTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ChangePwdPage changePwdPage;

	@BeforeMethod
	public void launchBrowser() {
		initialization();
		page = new AccountLoginPage();
	}

	@Test
	public void validateLogin() {
		AccountLoginPage page = new AccountLoginPage();
		myAccountPage = page.submitLogin("abcabc@gmail.com", "abcabc1");
		String myAccountText = myAccountPage.getMyAccountText();
		Assert.assertEquals(myAccountText, "My abc Account");
	}

	@Test
	public void validatePasswordUpdate() {

		// Login in
		myAccountPage = page.submitLogin("abcabc@gmail.com", "abcabc1");
		// Updating Password
		changePwdPage = myAccountPage.clickChangePasswordBtn();
		// Updating Password
		myAccountPage = changePwdPage.updatePassword("abcabc2", "abcabc2");

		String pwdAlertMessage = myAccountPage.getPasswordUpdateAlertText();

		// Asserting whether password change is successfully or not
		Assert.assertEquals("Success: Your password has been successfully updated.", pwdAlertMessage);

	}

	@Test
	public void validatePasswordUpdateWithOneInvalidPassword() {

		// Login in
		myAccountPage = page.submitLogin("abcabc@gmail.com", "abcabc1");
		// Updating Password
		changePwdPage = myAccountPage.clickChangePasswordBtn();
		// Updating Password
		myAccountPage = changePwdPage.updatePassword("abcabc2", "Invalid");

		String PasswordNotMatchMessage = myAccountPage.getPasswordNotMatchAlertText();
		// Asserting whether password change is successfully or not
		Assert.assertEquals("Password confirmation does not match password!", PasswordNotMatchMessage);

	}

	@AfterMethod

	public void closeBrowser() {
		tearDown();
	}
}
