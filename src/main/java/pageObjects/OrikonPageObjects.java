package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.CommonMethods;

public class OrikonPageObjects extends CommonMethods {
	

		public OrikonPageObjects ()
		{
			PageFactory.initElements(driver, this);
		}
			@FindBy(xpath = "//*[@id=\"emailAddress\"]")
			public WebElement emailAddress;
	

			@FindBy(xpath = "//*[@id=\"password\"]")
			public WebElement passwordEnter;
			
			@FindBy(xpath = "//*[@id=\"confirmPassword\"]")
			public WebElement confirmPassword;
			
			@FindBy(xpath = "/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button")
			public WebElement registrationNextPage;
			
			@FindBy(xpath = "//*[@id=\"firstName\"]")
			public WebElement firstName;
			
			
			@FindBy(xpath = "//*[@id=\"middleName\"]")
			public WebElement middleName;
			
			
			@FindBy(xpath = "//*[@id=\"lastName\"]")
			public WebElement lastName;
			
			
			@FindBy(xpath = "//*[@id=\"preferredFullName\"]")
			public WebElement preferredFullName;
			
			@FindBy(xpath = "//*[@id=\"addressLine1\"]")
			public WebElement addressLine1;
			
			@FindBy(xpath = "//*[@id=\"addressLine2\"]")
			public WebElement addressLine2;
			
			@FindBy(xpath = "//*[@id=\"addressLine3\"]")
			public WebElement addressLine3;
			
			
			@FindBy(xpath = "//*[@id=\"postcode\"]")
			public WebElement postCode;
			
			@FindBy(xpath = "//*[@id=\"city\"]")
			public WebElement cityName;
			
			
			@FindBy(xpath = "//*[@id=\"state\"]")
			public WebElement stateName;
			
			
			@FindBy(xpath = "/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button[2]")
			public WebElement contactNextButton;
			
			@FindBy(xpath = "//*[@id=\"cardHolderName\"]")
			public WebElement cardHolderName;
			
			@FindBy(xpath = "//*[@id=\"cardTypeVISA\"]")
			public WebElement cardTypeVISA;


			@FindBy(xpath = "//*[@id=\"cardTypeVISA\"]")
			public WebElement cardTypeMastercard;
			
			
			
			@FindBy(xpath = "//*[@id=\"cardNumber\"]")
			public WebElement cardNumber;
			
			
			@FindBy(xpath = "//*[@id=\"cardCVV\"]")
			public WebElement cardCVV;
			
			
			@FindBy(xpath = "//*[@id=\"cardExpiryMonth\"]")
			public WebElement cardExpiryMonth;
			
			
			
			@FindBy(xpath = "//*[@id=\"cardExpiryYear\"]")
			public WebElement cardExpiryYear;
			
			
			@FindBy(xpath = "/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button[2]")
			public WebElement paymentNextButton;
			
			
			@FindBy(xpath = "//*[@id=\"termsAndConditions\"]")
			public WebElement termsAndConditions;
			
			
			@FindBy(xpath = "//*[@id='agreedToTerms']")
			public WebElement agreedToTerms;
			
			
			@FindBy(xpath = "/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button[2]")
			public WebElement submitButton;
			

			@FindBy(xpath = "/html/body/app-root/div/div[2]/app-register-wizard/div[2]/app-register-complete-page/p[2]")
			public WebElement confirmationMessage;
}
