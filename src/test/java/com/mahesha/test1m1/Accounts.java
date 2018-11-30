package com.mahesha.test1m1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Accounts extends LoginPapercutBase{
	
	@BeforeMethod
	public void setUpAccounts()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Accounts']/parent::span/parent::a");
		
	}

	@Test(priority = 1)
	public void verifyAccountssMain()
	{
		titleVerify("Shared Account List");	
	}
	
	@Test(priority = 2)
	public void VerifySharedAccountSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Shared Account List']/parent::span/parent::a");
		titleVerify("Shared Account List");
	
	}
	
	@Test(priority = 3)
	public void VerifyBatchImpUpdateSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Batch Import / Update']/parent::span/parent::a");
		titleVerify("Batch Import / Update");
	
	}
	
	@Test(priority = 4)
	public void VerifySharedAccountSyncSubMenu()
	{
		clickLinkByXpath("//*[@id='content']/div[1]/ul/li[3]/div/a");
		titleVerify("Shared Account Sync");
	
	}
	

	

}
