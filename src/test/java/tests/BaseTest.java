package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import locators.LoginPageLocators;
import pages.LoginPage;

public class BaseTest {
	
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	};
	
	@Test
	public void navigateToSite() {
		driver.get(constants.SiteConstants.URL);
		
		Assert.assertTrue(driver.findElement(LoginPageLocators.USERNAME_FIELD).isDisplayed());
		Assert.assertTrue(driver.findElement(LoginPageLocators.PASSWORD_FIELD).isDisplayed());
		Assert.assertTrue(driver.findElement(LoginPageLocators.LOGIN_BUTTON).isDisplayed());
		
		LoginPage LoginPage = new LoginPage(driver);
		
		LoginPage.login(constants.SiteConstants.USERNAME, constants.SiteConstants.PASSWORD);
		
		if (LoginPage.isLoginErrorDisplayed()) {
			System.out.println(driver.findElement(LoginPageLocators.LOGIN_ERROR).getText());
		} else if (LoginPage.isLoginSuccessful()) {
			System.out.println("Login successful!");
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
