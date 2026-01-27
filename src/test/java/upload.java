import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class upload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://imgbb.com/");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//a[text()='Start uploading']")).click();
		  
		  String filePath = "‪C:\\Users\\deviv\\OneDrive\\Pictures.jpg";  // Use full path to your image
	        StringSelection selection = new StringSelection(filePath);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	        
	        Robot robot = new Robot();
	        robot.delay(1000);
	        
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.delay(500);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);

	}

}
