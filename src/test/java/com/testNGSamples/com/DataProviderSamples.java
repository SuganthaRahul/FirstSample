package com.testNGSamples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class DataProviderSamples extends BaseClass {
	@Test(dataProvider ="SampleTest", dataProviderClass=DataProviderSampleExcel.class)
	public void testMethod(String username,String password) {
		/*browserLaunch("chrome","https://adactinhotelapp.com/");
		WebElement user=findElementById("username");
		WebElement pwd=findElementById("password");
		WebElement login	=findElementById("login");
		user.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
		*/
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement user=driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.id("password"));
		WebElement log=driver.findElement(By.id("login"));
		user.sendKeys(username);
		pwd.sendKeys(password);
		log.click();
		
		
	}
	
	
	
	
	}
