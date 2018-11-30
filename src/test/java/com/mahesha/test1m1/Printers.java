package com.mahesha.test1m1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Printers extends LoginPapercutBase{
	
	@BeforeMethod
	public void setUpPrinters()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Printers']/parent::span/parent::a");
	}

	@Test(priority = 1)
	public void verifyPrintersMenu()
	{
		titleVerify("Printer List");	
	}
	
	@Test(priority = 2)
	public void verifyPrinterListSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Printer List']/parent::span/parent::a");
		titleVerify("Printer List");	
	}
	
	@Test(priority = 3)
	public void verifyJobsPendingReleaseSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Jobs Pending Release']/parent::span/parent::a");
		titleVerify("Jobs Pending Release");	
	}
	
	@Test(priority = 4)
	public void verifyNotificationOptionsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Notification Options']/parent::span/parent::a");
		titleVerify("Notification Options");	
	}
	
	@Test(priority = 5)
	public void verifyChartsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Charts']/parent::span/parent::a");
		titleVerify("Charts");	
	}
	
	@Test(priority = 6)
	public void verifyRefundsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Refunds']/parent::span/parent::a");
		titleVerify("User Refund Requests");	
	}
	
	
	
	

}
