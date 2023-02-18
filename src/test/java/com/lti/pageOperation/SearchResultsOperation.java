package com.lti.pageOperation;

	import org.openqa.selenium.WebDriver;

	import com.lti.pageElements.SearchResultsPage;

	public class SearchResultsOperation {

		SearchResultsPage searchresultPageOptObj = new SearchResultsPage();
		
		
		public void verifySearchResultsText(WebDriver driver) {
			String searchResultsText = driver.findElement(SearchResultsPage.searchResultsText).getText();
			if(searchResultsText.equals(searchResultsText)) {
				System.out.println("Test passed"); 
				}
			
			else {
				System.out.println("Test failed");
			}
		}
	}

