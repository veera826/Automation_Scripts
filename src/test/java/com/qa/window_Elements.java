package com.qa;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_Elements {
	
	
	public static void main(String[] args) throws Exception {
		
		 WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		  
			WebElement abc=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
			
			abc.click();
			
			String parentWindow = driver.getWindowHandle();
			
			
			
			 Set<String> handles = driver.getWindowHandles(); 
			 
			
			 
			 //Iterator<String>iterator = windowHandles.iterator();
				/*
				 * String parentWindow = iterator.next();
				 * 
				 * System.out.println(parentWindow);
				 * 
				 * String newWindow = iterator.next();
				 * 
				 * System.out.println(newWindow);
				 */
			 
			 for (String window : handles) {
				    if (!window.equals(parentWindow)) {
				    	
				    	
				    	
				        driver.switchTo().window(window);
				        
				        System.out.println(driver.getTitle());
				        
				        driver.close(); 
				        
				    }
			 
				    
				    driver.switchTo().window(parentWindow);
				    
				    

			        // switch back to child window
			        
				    
				    
				    
			 
			  
			
			
			 
		  
		  
		
			 }	

}
	
}
