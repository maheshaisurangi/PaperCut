package com.mahesha.test1m1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logs extends LoginPapercutBase{

	
	@BeforeMethod
	public void setUpLogs()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Logs']/parent::span/parent::a");		
	}
	
	@Test(priority = 1)
	public void verifyLogsMain()
	{
		titleVerify("Job Log");	
	}
	
	@Test(priority = 2)
	public void verifyJobLogSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Job Log']/parent::span/parent::a");
		titleVerify("Job Log");	
	}

	@Test(priority = 3)
	public void verifyApplicationLogSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Application Log']/parent::span/parent::a");
		titleVerify("Application Log");	
	}
	
	@Test(priority = 4)
	public void verifyAuditLogSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Audit Log']/parent::span/parent::a");
		titleVerify("Audit Log");	
	}

	
}
