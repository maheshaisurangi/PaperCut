package com.mahesha.test1m1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class About extends LoginPapercutBase{
	
	
	@BeforeMethod
	public void setAbout()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='About']/parent::span/parent::a");		
		
	}
	
	@Test
	public void verifyAboutMain()
	{
		titleVerify("About");	
	

	}
}
