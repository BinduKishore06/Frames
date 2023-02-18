package com.lti.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.lti.pageElements.SearchResultsPage;
import com.lti.pageOperation.HomePageOperation;
import com.lti.utility.BaseClass;

		public class TestRunner {
			
			
			HomePageOperation homepageOptObj = new HomePageOperation();
			BaseClass base = new BaseClass();

			SearchResultsPage searchresultPageOptObj = new SearchResultsPage();
			WebDriver driver;
				
			@BeforeTest
			public void initialize() {
				driver= base.openBrowser();
			}
			
			@Test
			public void myFirstTest() {
			base.navigateToApplication(driver);
		    homepageOptObj.enterTextIntoSearchBox(driver);
			homepageOptObj.clickOnSearchIcon(driver);
			searchresultPageOptObj.verifySearchResultsText();
			
			}
			

	}

