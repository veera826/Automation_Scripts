import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
  WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		  
	WebElement click=	  driver.findElement(By.xpath("//a[contains(text(), 'Create new')]"));
	
	click.click();
		  
		  
		  
		  
		  
			/*
			 * Actions actions = new Actions(driver);
			 * actions.moveByOffset(10,10).click().perform();
			 */
					 
		  
		  
		

		  Thread.sleep(2000);
		  
		  
		  WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		  
           System.out.println(radio.isSelected());
           
           if((radio.isSelected()==false)) {
        	   
        	   radio.click();
           }
        
           Thread.sleep(3000);
           
           System.out.println(radio.isSelected());
  
		  
		  
		  

	}
	
		  
		 
		  
	}
	


