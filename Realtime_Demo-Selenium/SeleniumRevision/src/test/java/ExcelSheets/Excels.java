package ExcelSheets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excels {
	
	@Test
	public void ExcelData() throws IOException{
		
		File f = new File("C:\\Users\\ravi\\Desktop\\Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Input");
		
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		
		System.out.println(sh.getRow(1).getCell(2).getStringCellValue());
		
	
		
		XSSFSheet ss = wb.createSheet("New1");
		
		ss.createRow(0).createCell(0).setCellValue("Ravi Teja Gude");
		ss.getRow(0).createCell(1).setCellValue("27");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println(ss.getLastRowNum());
		
		XSSFRow row = ss.getRow(0);
		System.out.println(row.getLastCellNum());
		
		wb.close();
	}

}
