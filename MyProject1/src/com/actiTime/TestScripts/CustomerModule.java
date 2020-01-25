package com.actiTime.TestScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actiTime.Genirices.BaseClassMethods;
import com.actiTime.ObjectRepoPOM.LogoutPageOfActiTime;
import com.actiTime.ObjectRepoPOM.TaskListPageOfActiTime;
/**
 * 
 * @author NavyaKM
 *
 */

public class CustomerModule extends BaseClassMethods
{
	// createing object globa so that we can use 
	LogoutPageOfActiTime Logout = new LogoutPageOfActiTime();
	TaskListPageOfActiTime Cust = new TaskListPageOfActiTime (driver);
	
	@Test
	public void testcreateCUST() throws InterruptedException
	{
		Reporter.log("New Customer is Created",true);
		
		//LogoutPageOfActiTime Logout = new LogoutPageOfActiTime();
		
		//TaskListPageOfActiTime Cust = new TaskListPageOfActiTime (driver);
	    Cust.getAddNewBTN().click();
	    Cust.getCreateCUSTBTN().click();
	    Thread.sleep(1000);
	    Cust.getEnterCustNameTBX().sendKeys();
	    Cust.getDiscriptionTBX().sendKeys();
	    Cust.getCustListBX().click();
	    Cust.getSelectCompany().click();
	    Cust.getCreateCUSTBTN().click();
	   
		
				
	}
	

}
