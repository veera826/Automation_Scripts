package com.qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParamTest {
	
	
	WebDriver driver;
	
	
	@BeforeTest
	
	@Parameters("browser")
	
	void setup(String br) {
		
		switch(br.toLowerCase()) {
		
		case "chrome": driver=new ChromeDriver();break;
		
		case "edge": driver=new EdgeDriver();break;
		
		case "firefox": driver=new FirefoxDriver(); break;
		
		default: System.out.println("invalid browser");
		
		return;
		
		
		}
		
		
		
		
	}
	
	@Parameters("url")
	@Test(priority=1)
	
	void LaunchApp(String url) {
		
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get(url);
		
       Actions actions = new Actions(driver); 
		 
		 actions.moveByOffset(10,10).click().perform();
		 
		 driver.manage().window().maximize();
		
		
		
		
			/*
			 * boolean status=driver.findElement(By.xpath(
			 * "/html/body/div[1]/div/div[1]/div[1]/div[1]/a")).isDisplayed();
			 * 
			 * Assert.assertEquals(status, true);
			 */
		

	}
	
	@Test(priority=2)
	void Title() {
		
		Assert.assertEquals(driver.getTitle(), "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
		
	}
	
	

}
