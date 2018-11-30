package com.mahesha.test1m1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class Users extends LoginPapercutBase{
	
	@BeforeMethod
	public void setUpUsers()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Users']/parent::span/parent::a");		
	}

	@Test
	public void verifyUsersMain()
	{
		titleVerify("User List");	
	}


}
