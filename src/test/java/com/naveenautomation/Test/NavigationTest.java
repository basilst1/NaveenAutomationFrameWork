package com.naveenautomation.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.NavigationPages;
import com.naveenautomation.testbase.TestBase;

import junit.framework.Assert;

public class NavigationTest extends TestBase {

	NavigationPages navigationPages;

	@BeforeMethod
	public void launchBrowser() {
		initialization();
	}

	@Test

	public void navigatingToContactUsForm() {
		navigationPages.goToContactUsForm;
		String bannerText = navigationPages.getTextInvalidCredentials();
		Assert.assertEquals(bannerText, "Warning: No match for E-Mail Address and/or Password.");

		
		
	}

	@Test
	
	public void navigateBackward() {
		navigationPages.goToContactUsForm;
		
		 driver.navigate().back();
	}

	@Test
	
	public void refreshPage() {
		navigationPages.goToContactUsForm;
		
		 driver.navigate().refresh();
	}

}
