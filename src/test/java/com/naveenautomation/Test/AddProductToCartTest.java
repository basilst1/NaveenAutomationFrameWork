package com.naveenautomation.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.AddProductToCartPage;
import com.naveenautomation.testbase.TestBase;

import junit.framework.Assert;

public class AddProductToCartTest extends TestBase {
	AddProductToCartPage addProductToCart;

	@BeforeMethod
	public void launchBrowser() {
		initialization();
	}

	@Test

	public void validateProductAddToCartFunction() {
		AddProductToCartPage page = new AddProductToCartPage();
		String successBannerText = addProductToCart.getTextYouHaveAdded();
		Assert.assertEquals(successBannerText, " Success: You have added ");

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
