package org.iit.mmp.iit.testcases;

import org.iit.mmp.base.TestBaseClass;
import org.iit.mmp.pages.AdminLoginpage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdminLoginTest extends TestBaseClass {
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
}
	
	
				
				
	
//	public patientsearchclick()
//	{
//		<td>
//		<a href="userprofile.php?pid=2797">sara </a>
//		</td>
//		<td> 345678123 </td>
//	}
//	
//	public changerequeststatus()
//	{
//		<select id="sapproval" class="form-control form-cascade-control nav-input-search" name="approval">
//		<option value="">Select Status</option>
//		<option value="1">Accepted</option>
//		<option value="0">Pending</option>
//		<option value="2">Rejected</option>
//		
//		public submitclick()
//		{
//		
//		input value="Submit" type="submit"/>
//		
//		alertbox ok
//	}
//}
