package com.mahesha.test1m1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Devices extends LoginPapercutBase{
	
	@BeforeMethod
	public void setUpDevices()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Devices']/parent::span/parent::a");		
	}
	
	@Test
	public void verifyDevicesMain()
	{
		titleVerify("External Device List");	
	}
	
	

}
