package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.testbase.TestBase;

public class NavigationPages extends TestBase {

	public NavigationPages() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "body>footer>div>div>div:nth-child(2)>ul>li:nth-child(1)>a")
	WebElement contactUsForm;

	private void goToContactUsForm() {
		contactUsForm.click();
	}
	public String getTextInvalidCredentials() {
		return InvalidBanner.getText();

}
}
