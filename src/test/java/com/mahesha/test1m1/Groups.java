package com.mahesha.test1m1;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups extends LoginPapercutBase{
	
	@BeforeMethod
	public void setUpGroups()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Groups']/parent::span/parent::a");		
	}

	@Test
	public void verifyGroupsMain()
	{
		titleVerify("Group List");	
	}


}
