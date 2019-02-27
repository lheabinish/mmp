package org.iit.mmp.pages;

import org.iit.util.UtilityFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AdminLoginpage extends UtilityFunctions {
	
	public static WebDriver driver;
		
	public AdminLoginpage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public boolean adminLogin(String uname,String pword)
	{
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.name("admin")).click();
		Reporter.log("--Clicked on Login Button--", true);
		String actual = driver.findElement(By.xpath("//h3")).getText();
		String expected = uname;
		return actual.contains(expected);
	}
	
	
	
}

