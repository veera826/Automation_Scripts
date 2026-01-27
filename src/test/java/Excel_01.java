import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_01 {
	
	public static void main(String[] args) throws IOException {
		

		File f=new File("C:\\Users\\deviv\\eclipse-workspace\\Selenium\\src\\test\\resources\\Copy of Book11.xlsx");
    	
    	FileInputStream fis=new FileInputStream(f);		
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(0);
        if (row == null) {
            System.out.println(""+"veera");  // Print empty if row is missing
        } else {
            XSSFCell cell = row.getCell(1);
            if (cell == null) {
                System.out.println("");  // Print empty if cell is missing
            } else {
                // Read cell value based on type
                if (cell.getCellType() == CellType.STRING) {
                    System.out.println(cell.getStringCellValue());
                } else if (cell.getCellType() == CellType.NUMERIC) {
                    System.out.println(cell.getNumericCellValue());
                } 
            }
        }

        wb.close();
        fis.close();
    }

		
		
	}


