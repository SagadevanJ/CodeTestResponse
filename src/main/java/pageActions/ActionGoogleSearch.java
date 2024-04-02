package pageActions;

import org.openqa.selenium.Keys;

import pageObjects.GoogleSearch;

public class ActionGoogleSearch extends GoogleSearch {

public void findYouTube()
{
	searchTextBox.sendKeys("Youtube");
	searchTextBox.sendKeys(Keys.ESCAPE);
	
	clickSearch.click();
	youTubeURL.click();
	driver.getTitle().equals("YouTube");
}

	}

