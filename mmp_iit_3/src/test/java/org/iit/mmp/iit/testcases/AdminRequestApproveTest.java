package org.iit.mmp.iit.testcases;

import org.iit.mmp.base.TestBaseClass;
import org.iit.mmp.pages.AdminLoginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdminRequestApproveTest extends TestBaseClass {
	

	@Parameters({"url"})
	@BeforeClass
	public void launchApplication(String url)
	{
		driver.get(url);
	}
	@Parameters({"username","password"})
	@Test(priority=1,description="TC_001")
	public void adminLoginTest(String username,String password)
	{
		AdminLoginpage aPage = new AdminLoginpage(driver);
			boolean result = aPage.adminLogin(username,password);
			Assert.assertTrue(result,"Login is successful");
	}
	
	public boolean userclick(String linktext,String expectedHeading)
	{
		
		driver.findElement(By.xpath("//ul/li/a/span[contains(text(),'\"+linkText+\"')]")).click();
		String actualHeading = driver.findElement(By.xpath("//h3[@class='panel-title']")).getText();
		return actualHeading.contains(expectedHeading);
	}
	public void userclickTest() {

		boolean result = userclick(" Users "," Admin Portal ");
		Assert.assertTrue(result,"Failed to navigate to the Patient Profile Page");
	}
	
	
	
	public void patientpendingSearch()
	{
		
	Select status=new Select(driver.findElement(By.name("search")));
		
	status.selectByVisibleText("Pending");
		
}
	
	public void patientnameSelect(String patientname,Integer ssn) {
		
		
	}
	public void patientpendingSearchTest() {
		
		
	}
	
}
