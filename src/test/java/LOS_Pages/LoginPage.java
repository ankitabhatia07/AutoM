package LOS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LOS_Config.Configuration;



public class LoginPage {
	
	
	
		   WebDriver driver;
		   
		   public LoginPage(WebDriver driver){
		      this.driver = driver;
		   }
		  
		   @FindBy (xpath=Configuration.username)
		   public WebElement username;
		   
		   @FindBy(xpath=Configuration.password)
		   public WebElement password;
		   
		   @FindBy(xpath=Configuration.login_btn)
		   public WebElement login_btn;
		   
		   
		   public void doLogin (String uname, String pwd)
		   {
			   username.sendKeys(uname);
			   password.sendKeys(pwd);
			   login_btn.click();
			 //  return PageFactory.initElements(driver, loanListPage.class);
			   
			   
			   
		   }

}

