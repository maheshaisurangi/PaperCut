package com.mahesha.test1m1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	
	public void clickLinkByXpath(String xpath) {
		List <WebElement> elements = driver.findElements(By.xpath(xpath));
		Assert.assertFalse(elements.isEmpty(), "Element is not found");
        elements.get(0).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
	public void titleVerify(String title){
		WebElement titleElement = driver.findElement(By.xpath("/html/body/div[@id='title']/h1/span"));
		Assert.assertEquals(titleElement.getText(), title, "Title verification failed");
	}
	
	@BeforeMethod
	public void setUpBase() throws FileNotFoundException{
		driver = new ChromeDriver();
		
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
		System.setProperty(property.getProperty("browser"), property.getProperty("browser_location"));
		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
	}
	
	@AfterMethod
	public void closeweb()
	{
		driver.quit();
	}

}
