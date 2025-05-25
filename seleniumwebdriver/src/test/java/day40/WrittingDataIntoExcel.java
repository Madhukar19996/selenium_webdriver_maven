package day40;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File --> Workbook--> Sheets-->Rows-->Cells

public class WrittingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
       FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\My_Testdata_File.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		 XSSFSheet sheet=workbook.createSheet("Test_Data");
		 
		 XSSFRow row1=sheet.createRow(0);
		 row1.createCell(0).setCellValue("Selenium");
		 row1.createCell(1).setCellValue("250");
		 row1.createCell(2).setCellValue("Anushman Sharma");
		 
		 XSSFRow row2=sheet.createRow(1);
		 row2.createCell(0).setCellValue("Playwright");
		 row2.createCell(1).setCellValue("400");
		 row2.createCell(2).setCellValue("Ankita Arora");
		 
		 XSSFRow row3=sheet.createRow(2);
		 row3.createCell(0).setCellValue("Cypress");
		 row3.createCell(1).setCellValue("300");
		 row3.createCell(2).setCellValue("Vikran Viz");
		 
		 workbook.write(file);
		 
		 workbook.close();
		 file.close();
		 
		 System.out.println("File is created...");
		
		
		

	}

}
