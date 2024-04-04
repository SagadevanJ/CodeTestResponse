package pageActions;


import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.openqa.selenium.By;
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
		String myStr = "sagadevan@testmail.com";
		emailAddress.sendKeys(myStr);
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(myStr);  
		System.out.println(matcher.matches());
		passwordEnter.sendKeys("Ambit");
		confirmPassword.sendKeys("Ambit");
		if (!matcher.matches()) 
		{
			driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[2]/app-register-user-page/form/div[1]/div/div/span")).getText().equals("Invalid address.");
			
			String bodyText = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[2]/app-register-user-page/form/div[1]/div/div/span")).getText();
			Assert.assertTrue(bodyText.contains("Invalid address."));
		}
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

		Thread.sleep(10000);
		agreedToTerms.click();
		submitButton.click();
		}

		public void successfullPage() {
		Assert.assertTrue(confirmationMessage.getText().contains("successfully registered"));
		
		}
	}
