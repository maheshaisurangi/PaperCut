package com.mahesha.test1m1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


public class Dashboard extends LoginPapercutBase {
	
	@BeforeMethod
	public void setUpDashboard()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Dashboard']/parent::span/parent::a");		
		
	}
	
	@Test
	public void verifyDashboardMain()
	{
		titleVerify("Dashboard");	
	}

}
