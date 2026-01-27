import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Optional;

public class Basetest {
	
	


	@BeforeMethod
	    public void setup(@Optional("chrome") String browser) {

	        WebDriver driver = null;

	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        }
	        else if (browser.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	        }
	        else if (browser.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        }

	       BrowserUtil.setDriver(driver);  // NOW THIS WORKS
	       
	       
	    }
	 
	 public  WebDriver getDriver() {
	        return BrowserUtil.getDriver();
	    }
	 
	 
	  @AfterMethod
	    public void tearDown() {
	        BrowserUtil.unload();   // ✅ Calling method from another class
	    }
	
	 
	 
}
