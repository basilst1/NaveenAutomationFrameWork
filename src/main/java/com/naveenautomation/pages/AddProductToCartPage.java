package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.testbase.TestBase;

public class AddProductToCartPage extends TestBase {

	public AddProductToCartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	WebElement addProductToCart;

	@FindBy(xpath = "//*[@id=\"product-category\"]/div[1]/text()[1]")
	WebElement successBanner;

	private void clickAddToCart() {
		addProductToCart.click();

	}

	public String getTextYouHaveAdded() {
		return successBanner.getText();
	}
}
