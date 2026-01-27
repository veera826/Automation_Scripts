package com.vr.listeners;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		  
			WebElement abc=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
			
			abc.click();
		  
		  
		  
		  
	
			/*
			 * WebElement actualElement =
			 * driver.findElement(By.xpath("//h5[text()='Login']"));
			 * 
			 * 
			 * 
			 * String actualText = actualElement.getText(); String expectedText = "Login";
			 * System.out.println("Element is present: " + actualText);
			 * 
			 * if (!actualElement.isDisplayed()) { // If the element is NOT displayed
			 * System.out.println("Element is hidden!"); } else {
			 * System.out.println("Element is visible."); }
			 * 
			 * // Perform text validation only if the element is visible if
			 * (!expectedText.equalsIgnoreCase(actualText)) { // If text does NOT match
			 * System.out.println("Text Comparison Result: Mismatch!"); } else {
			 * System.out.println("Text Comparison Result: Match!"); }
			 * 
			 * Thread.sleep(2000);
			 */
						    
			
						
						    
				
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
				 * String actualText1 = driver.findElement(By.
				 * xpath("//button[text()='Book a Free Demo']//following::button[text()='Book a Free Demo']"
				 * )).getText(); System.out.println("Extracted Text: " + actualText1);
				 * 
				 * 
				 * WebElement cl=driver.findElement(By.
				 * xpath("//button[text()='Book a Free Demo']//following::button[text()='Book a Free Demo']"
				 * )); cl.sendKeys(Keys.ENTER);
				 * 
				 * 
				 * WebElement scr=driver.findElement(By.
				 * xpath("//h3[text()='Our Clients From Around the World']"));
				 * 
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * 
				 * int elementPosition = scr.getLocation().getY();
				 * 
				 * 
				 * js.executeScript("window.scrollTo(0, arguments[0] - 300);", elementPosition);
				 * 
				 */
				
				
				
				
				
				
				
				
				
				
				/*
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * 
				 * 
				 * WebElement cl=driver.findElement(By.
				 * xpath("//button[text()='Book a Free Demo']//following::button[text()='Book a Free Demo']"
				 * ));
				 * 
				 * js.executeScript("arguments[0].click();", cl);
				 */

				  
				  
					/*
					 * Actions actions = new Actions(driver);
					 * actions.moveToElement(cl).click().perform();
					 */

				  
				 // cl.sendKeys(Keys.ENTER);
				 
				
				/*
				 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				 * wait.until(ExpectedConditions.elementToBeClickable(By.
				 * xpath("//button[text()='Book a Free Demo']//following::button[text()='Book a Free Demo']"
				 * ))).click();
				 */
				
				

				
				
				
				
				
				/*
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * js.executeScript("window.scrollBy(0, 500);");
				 */
				
				
				/*
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * 
				 * js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
				 */

				
				/*
				 * Actions actions = new Actions(driver);
				 * actions.sendKeys(Keys.PAGE_DOWN).perform(); // Scroll down one page
				 * actions.sendKeys(Keys.PAGE_UP).perform(); // Scroll up one page
				 */

				 
				
				
				
				

				
				
				
				
						    
						    



		  
		  
		  
		  
		  
		  

	}

}
