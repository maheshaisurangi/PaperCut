package com.mahesha.test1m1;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;


public class Version extends LoginPapercutBase {
	
	@Test
	public void CompareVersion()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='About']/parent::span/parent::a");
		String versionbuild = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/p[1]")).getText();
		String[] parts = versionbuild.split("\\("); // Version: 18.3.2 (Build 47394)
		String splitaboutversion = parts[0]; // Version: 18.3.2 
		
		
		String[] secondpartsversion = splitaboutversion.split(":"); //  Version: 18.3.2 
		String aboutversion = secondpartsversion[1]; //18.3.2
		
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Dashboard']/parent::span/parent::a");
		String dversion = driver.findElement(By.xpath("//*[@id='footer']/div/span[2]")).getText();
		
		aboutversion = aboutversion.replaceAll("\\s","");
		
		Assert.assertEquals(aboutversion, dversion, "Version verification failed");
	} 
	
	@Test
	public void CompareBuild()
	{
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='Dashboard']/parent::span/parent::a");
		String dbuild = driver.findElement(By.xpath("//*[@id='footer']/div/span[3]")).getText(); // (Build 47394
		String[] buildparts = dbuild.split("d");
		String dbuildnumber = buildparts[1]; // 47394
		
		dbuildnumber = dbuildnumber.replaceAll("\\s",""); //removed spaces 
		
		clickLinkByXpath("//div[@id='mainnav']/ul//span[text()='About']/parent::span/parent::a");
		String versionbuild2 = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/p[1]")).getText();
		String[] parts2 = versionbuild2.split("\\("); // Version: 18.3.2 (Build 47394)
		
		String splitaboutbuild2 = parts2[1]; // Build 47394)
		
		String[] aboutbuildphrase = splitaboutbuild2.split("d");
		String aboutbuild2 = aboutbuildphrase[1]; // 47394)
		
		String[] Aboutbuild = aboutbuild2.split("\\)");
		String aboutbuildnumber = Aboutbuild[0];  // 47394
		aboutbuildnumber = aboutbuildnumber.replaceAll("\\s","");
		
		
		Assert.assertEquals(aboutbuildnumber, dbuildnumber, "Version verification failed");
		
	}
	

}
