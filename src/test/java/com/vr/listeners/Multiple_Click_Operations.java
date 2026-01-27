package com.vr.listeners;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Click_Operations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		  
		  WebElement abc=driver.findElement(By.cssSelector("button[type='submit']"));
		  
		 // Actions actions = new Actions(driver);
		  
		 //actions.moveToElement(abc).click().build().perform();
		  
		  abc.sendKeys(Keys.ENTER);
		  
		  
		  
		  
		  
		  
		  
		  
		  
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(0, 500);");
			 */
		  
		  	
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * 
			 * js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			 * 
			 */
		  
		  
		    
			/*
			 * WebElement abc=driver.findElement(By.cssSelector("button[type='submit']"));
			 * //abc.click(); Actions actions = new Actions(driver);
			 * actions.click(abc).build().perform();
			 */
			//actions.moveToElement(abc).build().perform();
			
			
			/*
			 * Thread.sleep(5000);
			 * 
			 * Set<String> windowHandles = driver.getWindowHandles(); Iterator<String>
			 * iterator = windowHandles.iterator();
			 * 
			 * String parentWindow = iterator.next(); String newWindow = iterator.next();
			 * 
			 * 
			 * driver.switchTo().window(newWindow);
			 * 
			 * WebElement actualText1 = driver.findElement(By.
			 * xpath("//button[text()='Book a Free Demo']//following::button[text()='Book a Free Demo']"
			 * )); System.out.println("Extracted Text: " + actualText1.getText());
			 * 
			 * String color = actualText1.getCssValue("color");
			 * System.out.println("Text Color: " + color);
			 * 
			 */
			
			/*
			 * WebElement cl=driver.findElement(By.
			 * xpath("//button[text()='Book a Free Demo']//following::button[text()='Book a Free Demo']"
			 * )); cl.sendKeys(Keys.ENTER);
			 */
			
			
			/*
			 * Actions actions = new Actions(driver);
			 * actions.moveToElement(abc).click().perform();
			 */
			 
			
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * 
			 * js.executeScript("arguments[0].click();", abc);
			 */
			
			//abc.sendKeys(Keys.ENTER);
			
			
					
	}
	

}
