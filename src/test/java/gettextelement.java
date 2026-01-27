import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gettextelement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(1000);

		driver.manage().window().maximize();
		
		
		
		 Actions actions = new Actions(driver); 
		 
		 actions.moveByOffset(10,10).click().perform();
		 
		 
		 
		 
		
		
		/*
		 * String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new
		 * Date());
		 * 
		 * System.out.println(timestamp);
		 */
		
		
		/*
		 * File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * 
		 * String userHome = System.getProperty("user.dir");
		 */
		 
		 
		 
		
		/*
		 * File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * 
		 * 
		 * FileUtils.copyFile(src, new
		 * File("C:\\Users\\deviv\\OneDrive\\Desktop\\Screenshots\\group\\veera.jpg"));
		 */
		
		
			/*
		 * Actions actions = new Actions(driver); actions.moveByOffset(10,
		 * 10).click().perform();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement drop = driver .findElement(By.
		 * xpath("//*[@id=\"top-banner\"]//label//span[contains(text(), 'From')]"));
		 * drop.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement drop1 =
		 * driver.findElement(By.xpath("//div[@role='combobox']/input"));
		 * 
		 * drop1.sendKeys("chennai");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * drop1.sendKeys(Keys.ARROW_DOWN);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * drop1.sendKeys(Keys.ENTER);
		 * 
		 * 
		 * String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new
		 * Date());
		 * 
		 * File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * 
		 * FileUtils.copyFile(src, new
		 * File("C:\\Users\\deviv\\OneDrive\\Desktop\\Screenshots\\group\\veera.jpg"));
		 */
		 

		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("document.getElementById('overlay').style.display='none';");
		 */

		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * 
		 * 
		 * js.
		 * executeScript("document.getElementById('email').setAttribute('value', 'TestUser');"
		 * );
		 */
		/*
		 * WebElement uname1=driver.findElement(By.xpath(
		 * "//*[@id=\"globalContainer\"]//form//button"));
		 */

		
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].value='veera';", uname);
		 * js.executeScript("arguments[0].click();", uname1);
		 */

		/*
		 * actions.moveToElement(uname).click().sendKeys("TestUser").build().perform();
		 * 
		 * actions.moveToElement(uname).doubleClick().perform();
		 */

		/*
		 * actions.moveToElement(uname).doubleClick().sendKeys(Keys.BACK_SPACE).perform(
		 * );
		 */

		/* actions.moveToElement(uname1).click().perform(); */

	}



}
