package com.mahesha.test1m1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

class LoginPapercutBase extends BaseClass {
	
	
	
	@BeforeMethod
	public void setUpLogin () throws FileNotFoundException
	{
		Properties property = new Properties();
		FileInputStream objfile = new FileInputStream("src\\main\\java\\config.properties");
		
		try {
			property.load(objfile);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			try{
				if(objfile !=null){
					objfile.close();
				}
			} catch (IOException e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		driver.findElement(By.id("inputUsername")).sendKeys(property.getProperty("username"));
		driver.findElement(By.id("inputPassword")).sendKeys(property.getProperty("password"));
		driver.findElement(By.xpath("//*[@id='login']/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	}

}

public class LoginPapercut extends LoginPapercutBase{
	@Test
	public void verifyLoginName()
	{
		String username = driver.findElement(By.id("username")).getText();
		Assert.assertEquals("admin", username);	
	}
}
