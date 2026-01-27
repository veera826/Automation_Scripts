package com.qa;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class Basetest  {
	
	//WebDriver driver;
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	
	
	
	   @BeforeMethod
	    public void setup(String browser) {


	        if (browser.equalsIgnoreCase("chrome")) {
	        	
	        	WebDriverManager.chromedriver().setup();
	        	
	           driver.set(new ChromeDriver());
	       }
	        else if (browser.equalsIgnoreCase("firefox")) {
	            driver .set(new FirefoxDriver());
	        }
	        else if (browser.equalsIgnoreCase("edge")) {
	            driver.set(new EdgeDriver() );
	        }

	        // NOW THIS WORKS
	       
	       
	    }
	 
	   public  WebDriver getDriver() {
	         return driver.get();
	    }
	   
	   
	   public void launchUrl(String configKey) {
	        String url = ConfigReader.get(configKey);
	        getDriver().get(url);
	    }
	   
	   

	 public void takeScreenshot(String name) throws IOException {
		 
		   // WebDriver driver=getDriver();
		    String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		    File src = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src, new File("Screenshots/" + name + "_" + time + ".png"));
		}
	 
	 
	 
	 
		
	
	 
	 
}
