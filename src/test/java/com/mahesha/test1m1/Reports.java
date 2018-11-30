package com.mahesha.test1m1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Reports extends LoginPapercutBase {
	
	@BeforeMethod
	public void setUpReports()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Reports']/parent::span/parent::a");		
	}
	
	@Test(priority = 1)
	public void verifyReportsMenu()
	{
		titleVerify("User Reports");	
	}
	
	@Test(priority = 2)
	public void verifyUserReportsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='User']/parent::span/parent::a");
		titleVerify("User Reports");	
	}

	@Test(priority = 3)
	public void verifyPrinterReportsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Printer']/parent::span/parent::a");
		titleVerify("Printer Reports");	
	}
	
	@Test(priority = 4)
	public void verifyGroupReportsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Group']/parent::span/parent::a");
		titleVerify("Group Reports");	
	}
	
	@Test(priority = 5)
	public void verifySharedAccountReportSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Account']/parent::span/parent::a");
		titleVerify("Shared Account Reports");	
	}
	
	@Test(priority = 6)
	public void verifyEnvironmentReportsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Environment']/parent::span/parent::a");
		titleVerify("Environment Reports");	
	}
	
	@Test(priority = 7)
	public void verifyTransactionReportsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Transaction']/parent::span/parent::a");
		titleVerify("Transaction Reports");	
	}
	
	@Test(priority = 8)
	public void verifyScheduleEmailReportsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Schedule / Email Reports']/parent::span/parent::a");
		titleVerify("Schedule / Email Reports");	
	}


	
	
}
