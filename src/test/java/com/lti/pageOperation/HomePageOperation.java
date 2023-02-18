package com.lti.pageOperation;

	import org.openqa.selenium.WebDriver;

    import com.lti.pageElements.Homepage;

	public class HomePageOperation {
		Homepage homepageOptObj = new Homepage();
		
		public void enterTextIntoSearchBox(WebDriver driver)
		{
			driver.findElement(Homepage.searchBox).sendKeys("mobile");
		}
		
		public void clickOnSearchIcon(WebDriver driver) {
			driver.findElement(Homepage.searchIcon).click();
		}
	}
