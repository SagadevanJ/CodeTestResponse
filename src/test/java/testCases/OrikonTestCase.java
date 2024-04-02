package testCases;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseClass.CommonMethods;
import pageActions.OrikonAction;

public class OrikonTestCase extends CommonMethods{

	OrikonAction orikonAction;
@BeforeSuite
public void init()
{
	initialization();
	
}


@BeforeTest
public void objectCall()
{

	orikonAction = new OrikonAction();

	
}

@Test
public void TC01_RegistrationPage()
{

	orikonAction.registrationPage();

}

@Test
public void TC02_ContactPage()
{

	orikonAction.contactPage();

}


@Test
public void TC03_PaymentPage()
{

	orikonAction.paymentPage();

}
@Test
public void TC04_TermsPage() throws InterruptedException
{

	orikonAction.termsPage();

}
@Test
public void TC05_SuccessfullPage()
{

	orikonAction.successfullPage();

}

















}
