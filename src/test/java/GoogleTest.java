import org.openqa.selenium.Capabilities;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest extends Basetest {

    @Test
    public void openGoogle() {
   getDriver().get("https://google.com");
   

        System.out.println("Title: " + getDriver().getTitle());
        
        Capabilities caps = ((RemoteWebDriver) getDriver()).getCapabilities();
        System.out.println("Browser → " + caps.getBrowserName());
        System.out.println("Session ID → " + ((RemoteWebDriver) getDriver()).getSessionId());
    }
    
   @Test
    
    public void openGoogle1() {
    getDriver().get("https://www.facebook.com/");
    System.out.println("Title: " + getDriver().getTitle());
    
    System.out.println("Test running on thread: " + Thread.currentThread().getName());
}
    
    
	
	
	

}
