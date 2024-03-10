package com.naveenautomation.Test;

import org.testng.annotations.BeforeMethod;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.testbase.TestBase;

public class YourAffiliateInformationTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		initialization();
		page = new AccountLoginPage();
	}

}
