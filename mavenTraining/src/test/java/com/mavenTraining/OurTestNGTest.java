package com.mavenTraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class OurTestNGTest {
	
	@Test
	public void testexe() throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		String ourUrl = "http://newtours.demoaut.com/";
		
		System.out.println("Our Test Starts");
		
		driver.get(ourUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String expectedTitle = "Welcome: Mercury Tours";
		
		System.out.println("Expected Title is : "+expectedTitle);
		System.out.println("Actual Title is : "+driver.getTitle());
		
		Assert.assertEquals(expectedTitle, driver.getTitle());
		driver.close();
			
	}

}
