package com.mahesha.test1m1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Options extends LoginPapercutBase {
	
	@BeforeMethod
	public void setUpOptions()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Options']/parent::span/parent::a");		
	}
	
	@Test(priority = 1)
	public void verifyOptionsMain()
	{
		titleVerify("General");	
	}

	@Test(priority = 2)
	public void verifyGeneralSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='General']/parent::span/parent::a");
		titleVerify("General");	
	}

	@Test(priority = 3)
	public void verifyMobileByodSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Mobile & BYOD']/parent::span/parent::a");
		titleVerify("Mobile & BYOD");	
	}
	
	@Test(priority = 4)
	public void verifyNotificationsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Notifications']/parent::span/parent::a");
		titleVerify("Notifications");	
	}
	
	@Test(priority = 5)
	public void verifyUserGroupSyncSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='User/Group Sync']/parent::span/parent::a");
		titleVerify("User/Group Sync");	
	}
	
	@Test(priority = 6)
	public void verifyAdminRightsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Admin Rights']/parent::span/parent::a");
		titleVerify("Admin Rights");	
	}
	
	@Test(priority = 7)
	public void verifyBackupsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Backups']/parent::span/parent::a");
		titleVerify("Backups");	
	}
	
	@Test(priority = 8)
	public void verifyToolsSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Tools']/parent::span/parent::a");
		titleVerify("Tools");	
	}
	
	@Test(priority = 9)
	public void verifyAdvancedSubMenu()
	{
		clickLinkByXpath("//ul[@class='tabList']//span[normalize-space(text())='Advanced']/parent::span/parent::a");
		titleVerify("Advanced");	
	}
	

}
