package locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
	public static final By USERNAME_FIELD = By.xpath("//input[@formcontrolname='username']");
	public static final By PASSWORD_FIELD = By.xpath("//input[@data-dph-id='password']");
	public static final By LOGIN_BUTTON = By.xpath("//button[@type='submit' and contains(span, 'Login')]");
	
	
	public static final By LOGIN_ERROR = By.xpath("//div[contains(@class, 'dph-input-error')]");
}
