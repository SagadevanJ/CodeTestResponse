package testCases;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseClass.CommonMethods;
import pageActions.ActionGoogleSearch;

public class TestGoogleSearch extends CommonMethods{

	ActionGoogleSearch actionGoogleSearch;
@BeforeSuite
public void init()
{
	initialization();
	
}


@BeforeTest
public void objectCall()
{

	actionGoogleSearch = new ActionGoogleSearch();

	
}

@Test
public void testcase1()
{

	actionGoogleSearch.findYouTube();
{
	
}

}}
