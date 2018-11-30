package com.mahesha.test1m1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cards extends LoginPapercutBase {
	
	@BeforeMethod
	public void setUpCards()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Cards']/parent::span/parent::a");		
		
	}
	
	@Test
	public void verifyCardsMain()
	{
		titleVerify("TopUp/PrePaid Card Management");	
	}

}
