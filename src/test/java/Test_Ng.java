
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



	public class Test_Ng {

	  
   static WebDriver driver;
	  
	  
	  @BeforeMethod
	  
	  public static void login() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	   driver=new ChromeDriver();
	  
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().window().maximize();
	  
	  }
	  
	  @Test() public static void Excel() throws Exception {
	  
	  
	  File f=new File("C:\\Users\\deviv\\eclipse-workspace\\Selenium\\src\\test\\resources\\TestData.xlsx");
	  
	  FileInputStream fis=new FileInputStream(f);
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  
	  XSSFSheet sheet=wb.getSheet("Sheet1");
	  
	  int rowc=sheet.getLastRowNum();
	  
	  for (int i = 0; i <=rowc; i++) {
	  
	  XSSFRow currentrow=sheet.getRow(i);
	  
	  
	  if (currentrow == null)
	  
	  continue;
	  
	  
	  String uname = getCellValue(currentrow.getCell(0)); 
	  String pname = getCellValue(currentrow.getCell(1));
	  
	  WebElement emailField = driver.findElement(By.xpath("//*[@id='email']"));
	  
	  WebElement passwordField= driver.findElement(By.xpath("//*[@id='pass']"));
	  
	  WebElement loginbutton=driver.findElement(By.xpath("//*[@type='submit']"));
	  
	  emailField.sendKeys(uname);
	  
	  passwordField.sendKeys(pname);
	  
	  
	  driver.switchTo().newWindow(WindowType.TAB); 

	  
	  
	  driver.get("https://www.facebook.com/");
	  
	 
	  
	  
	  }
	  
	  
	  
	  }
	  
	  public static String getCellValue(Cell cell) { 
		  if (cell == null) 
			  return "";
	  switch (cell.getCellType()) { 
	  case STRING: return cell.getStringCellValue();
	  case NUMERIC: return String.valueOf(cell.getNumericCellValue());
	  case BOOLEAN: return String.valueOf(cell.getBooleanCellValue()); 
	  default: return "";
	  
	  }
	  
	  
	  
	  
	  }
	  
	}
	 


