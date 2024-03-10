package com.naveenautomation.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.testbase.TestBase;

import junit.framework.Assert;

public class AccountLoginPageTest extends TestBase {
	AccountLoginPage accountLogin;

	@BeforeMethod
	public void launchBrowser() {
		initialization();
	}

	@Test

	public void validateLoginUsingValidEmailAndPassword() {
		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin("basilabc@gmail.com", "Qwerty2");
		String bannerText = accountLogin.getTextInvalidCredentials();
		Assert.assertEquals(bannerText, "Warning: No match for E-Mail Address and/or Password.");

	}

	@Test
	public void validateLoginUsingValidEmailAndInvalidPassword() {
		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin("abcabc@gmail.com", "Invalid");
		String bannerText = accountLogin.getTextInvalidCredentials();
		Assert.assertEquals(bannerText, "Warning: No match for E-Mail Address and/or Password.");

	}

	@Test
	public void validateLoginUsingInvalidEmailAndvalidPassword() {
		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin("invalidabc@gmail.com", "Qwerty2");
		String bannerText = accountLogin.getTextInvalidCredentials();
		Assert.assertEquals(bannerText, "Warning: No match for E-Mail Address and/or Password.");

	}

	@Test
	public void validateLoginUsingInvalidEmailAndInvalidvalidPassword() {
		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin("invalidabc@gmail.com", "Invalid");
		String bannerText = accountLogin.getTextInvalidCredentials();
		Assert.assertEquals(bannerText, "Warning: No match for E-Mail Address and/or Password.");

	}

	@AfterMethod
	public void closeBrowser() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tearDown();
	}

}
