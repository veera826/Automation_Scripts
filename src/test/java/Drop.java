import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Drop {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		 WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.amazon.in/");
		  
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  Thread.sleep(2000);
		  
		  
			
			  WebElement dropd1 =
			  driver.findElement(By.xpath("//*[@id='nav-search-dropdown-card']"));
			  
			  dropd1.click();
			  
			  
			  List<WebElement> values=dropd1.findElements(By.tagName("option"));
			  
			  System.out.println(values.size());
			  
			  for(WebElement options:values) {
				  
				  System.out.println(options.getText());
				  
			  }
			  
	}
			  
			  
			  
				/*
				 * String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new
				 * Date());
				 * 
				 * File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				 * 
				 * FileUtils.copyFile( src, new
				 * File("C:\\Users\\deviv\\OneDrive\\Desktop\\Screenshots\\group\\veera_" +
				 * timestamp + ".png") );
				 */
			  
			  public static void takeScreenshot(WebDriver driver, String name) throws IOException {
				    String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
				    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				    FileUtils.copyFile(src, new File("Screenshots/" + name + "_" + time + ".png"));
				}
			 
					  

	}

