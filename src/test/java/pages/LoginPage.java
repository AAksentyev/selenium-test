package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	public void enterUsername(String username) {
		driver.findElement(locators.LoginPageLocators.USERNAME_FIELD).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(locators.LoginPageLocators.PASSWORD_FIELD).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(locators.LoginPageLocators.LOGIN_BUTTON).click();
	}
	
	/* Enter the username, the password, and click log. Also wait for the login process to finish.*/
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
		
		waitForLoginToProcess();
		
	}
	
	/* 
	 * Wait for the login process to finish. It will either display an error on the login page or redirect the user to the Dashboard.
	 * Check for either of those elements to appear. We can wait for a shorter amount of time for the error to appear
	 * */
	public void waitForLoginToProcess() {
		
		WebElement error = null;
		WebElement welcomeMsg = null;
		
		WebDriverWait loginWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait errorWait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		try {
			error = errorWait.until(ExpectedConditions.visibilityOfElementLocated(locators.LoginPageLocators.LOGIN_ERROR));
		} catch (Exception e) {

		}
		
		
		if (error == null) {
			try {
				welcomeMsg = loginWait.until(ExpectedConditions.visibilityOfElementLocated(locators.DashboardPageLocators.WELCOME_MESSAGE));
			} catch (Exception e) {

			}
			
		}
		
	}
	
	/* verify if the login was successful by confirming that the Welcome message is visible on the dashboard */
	public boolean isLoginSuccessful() {
		
		boolean msg = false;
		
		try {
			msg = driver.findElement(locators.DashboardPageLocators.WELCOME_MESSAGE).isDisplayed();
		} catch (Exception e) {
			
		}
		
		return msg;
		
	}
	
	/* Verify if some sort of error was displayed after a login attempt */
	public boolean isLoginErrorDisplayed() {
		
		boolean msg = false;
		
		try {
			msg = driver.findElement(locators.LoginPageLocators.LOGIN_ERROR).isDisplayed();
		} catch (Exception e) {
			
		}
		
		return msg;

	}
}
