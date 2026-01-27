
import org.openqa.selenium.WebDriver;



public class BrowserUtil {

	
	
	
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return tlDriver.get();
    }
    public static void unload() {
        tlDriver.get().quit();
        tlDriver.remove();
        
    }
    
   
    


	public static void setDriver(WebDriver driver) {
		// TODO Auto-generated method stub
		 tlDriver.set(driver);
	}
	

}
