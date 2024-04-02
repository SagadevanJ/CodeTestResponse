package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.CommonMethods;

public class GoogleSearch extends CommonMethods {

public GoogleSearch ()
{
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//*[@id=\"APjFqb\"]")
	public WebElement searchTextBox;
	

	@FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
	public WebElement clickSearch;
	
	@FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")
	public WebElement youTubeURL;
	
	
	}

