import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_List {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		  WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.amazon.in/");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		  
		 // WebElement dropd =
					  //driver.findElement(By.xpath("//*[@id='a-page']//form//div[@id='nav-search-dropdown-card']//following::input[contains(@placeholder, 'Search')]"));
		  
		  //dropd.sendKeys("amazon");
		  
		  
		  //String enteredValue = dropd.getAttribute("value");
		  //System.out.println("Entered value is: " + enteredValue);
					  
			/*
			 * WebElement dropd1 =
			 * driver.findElement(By.xpath("//*[@id='nav-search-dropdown-card']"));
			 * 
			 * dropd1.click();
			 */
					  
					  
			/*
			 * WebElement
			 * dropDown=driver.findElement(By.xpath("//*[@id='nav-xshop-container']"));
			 * 
			 * List<WebElement>drop=dropDown.findElements(By.tagName("a"));
			 * 
			 * System.out.println(drop.size());
			 * 
			 * for (WebElement ele : drop) { System.out.println(ele.getText()); }
			 */
		  
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		  WebElement menu = driver.findElement(By.id("nav-xshop-container"));
		  List<WebElement> links = menu.findElements(By.tagName("a"));

		  for (int i = 0; i < links.size(); i++) {

		      menu = driver.findElement(By.id("nav-xshop-container"));
		      links = menu.findElements(By.tagName("a"));

		      WebElement link = links.get(i);

		      js.executeScript("arguments[0].scrollIntoView(true);", link);
		      //Thread.sleep(500);

		      System.out.println("Clicking: " + link.getText());
		      
		      

		      //link.click();
		      
		      wait.until(ExpectedConditions.elementToBeClickable(link)).click();
		      Thread.sleep(2000);

		      driver.navigate().back();
		      Thread.sleep(2000);
		  }
		  
		  
		  
			
			
			  
			 
		  
		//*[@id="a-page"]//form//div[@id='nav-search-dropdown-card']
		  
		//*[@id="a-page"]//form//div[@id='nav-search-dropdown-card']//following::input[contains(@placeholder, 'Search')]
		  
		/*
		 * List<WebElement>option=driver.findElements(By.tagName("select"));
		 * 
		 * 
		 * 
		 * 
		 * for (WebElement dropdown : option) { String name =
		 * dropdown.getAttribute("id"); System.out.println("Dropdown name: " + name); }
		 */
			 

		  
	
		
  
  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			 
		  
		/*  List<WebElement>list=dropd.findElements(By.tagName("option"));
		  
		  
		  for(int i=0;i<list.size();i++) {
			  
			 // list.get(i).click();
			  
			  if(list.get(i).getText().contains("Amazon Fresh")) {
				  
				  
				  list.get(i).click();
				  
				  
				  System.out.println("Active");
				  
				  break;
			  }
			  */
				
		  }
		  
		  
		  

		  
		  
		  
		  
		 

	
		  
		  
		  
		  
		  
		

		  
		  
		  
		
		  
			

		  
		  
		  
		  
		  
		  
		  

	}


