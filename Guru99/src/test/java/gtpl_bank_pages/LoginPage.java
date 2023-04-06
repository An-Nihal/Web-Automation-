package gtpl_bank_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.name("uid");
	By password = By.name("password");
	By Login_btn = By.name("btnLogin");
	
	
	public void WriteUsername(String Username)
	{
		driver.findElement(username).sendKeys(Username);
	}
	public void WritePassword(String Pass)
	{
		driver.findElement(password).sendKeys(Pass);
	}
	public void ClickLogin()
	{
		driver.findElement(Login_btn).click();
	}
	
	
	

}
//this.value(global variable)