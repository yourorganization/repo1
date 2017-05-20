package com.myorganization.tests.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class sanitytests {
	WebDriver driver=null;
	
@Test
public void TC001()
{
	System.out.println("Executing Step 1.....");
	
	System.setProperty("webdriver.gecko.driver", "lib\\geckodriver-v0.16.1-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	
	System.out.println("Executing Step 2.....");	
	driver.get("http://www.google.com");
	
	System.out.println("Executing Step 3.....");
	WebElement label1 = driver.findElement(By.xpath(".//*[@id='hplogo']/div"));
	System.out.println("Executing Step 4.....");
	Assert.assertEquals( label1.getText(),"Indians");
	
	
}
	
	@AfterTest
	public void test()
	{
		driver.quit();
	}
	
}
