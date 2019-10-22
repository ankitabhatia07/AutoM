package LOS_testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import LOS_Pages.LoginPage;
import LOS_Pages.loanListPage;




public class LoginTest {
	
	
	public static Properties Config ;
	public static FileInputStream fis;
	
	@Test

	public void init() throws IOException
	{
	
	
	fis = new FileInputStream(System.getProperty("user.dir") +"/src/main/java/LOS_Config/config.properties");
    Config = new Properties();
    Config.load(fis);
	

	
	
	System.setProperty("webdriver.chrome.driver", "/Users/wiznidev/eclipse-workspace/com.lendwize/chromedriver");  
	WebDriver driver = new ChromeDriver();
	
	driver.get(Config.getProperty("testsiteurl"));
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
	lp.doLogin(Config.getProperty("user"), Config.getProperty("passwrd"));
	
	
	
}
	
}
