package pageActions;


import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import pageObjects.OrikonPageObjects;

public class OrikonAction extends OrikonPageObjects {
	
	public static Wait<WebDriver> wait;
		
		public void registrationPage() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));
		emailAddress.sendKeys("sagadevan@testmail.com");
		passwordEnter.sendKeys("Ambit");
		confirmPassword.sendKeys("Ambit");
		registrationNextPage.click();
		}
		
		public void contactPage() {
		
		firstName.sendKeys("Saga");
		middleName.sendKeys("Devan");
		lastName.sendKeys("Jagan");
		addressLine1.sendKeys("AddressLine1");
		addressLine2.sendKeys("AddressLine2");
		addressLine3.sendKeys("AddressLine3");
		postCode.sendKeys("600053");
		cityName.sendKeys("Chennai");
		Select selectState = new Select(stateName);
		selectState.selectByVisibleText("Queensland");
		contactNextButton.click();
		}
		
		public void paymentPage() {
		
		cardHolderName.sendKeys("Saga");
		cardTypeVISA.click();
		cardTypeMastercard.click();
		cardNumber.sendKeys("12345678910");
		cardCVV.sendKeys("987");
		Select expiryMonth = new Select(cardExpiryMonth);
		expiryMonth.selectByVisibleText("April");
		cardExpiryYear.sendKeys("2029");
		paymentNextButton.click();
		
		}
		
		public void termsPage() throws InterruptedException {
		termsAndConditions.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[1];",termsAndConditions,2000);
		
		//for (int i=0; i<10; i++)
		//{
			//termsAndConditions.sendKeys(Keys.ARROW_DOWN);
		//}
		
		Thread.sleep(7000);
		//Wait<WebDriver> wait = WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(agreedToTerms));
		agreedToTerms.click();
		submitButton.click();
		
		
		
		}
		

		public void successfullPage() {
		Assert.assertTrue(confirmationMessage.getText().contains("Successfully registered user"));
			
		}
	}
