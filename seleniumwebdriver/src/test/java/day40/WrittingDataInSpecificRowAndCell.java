package day40;

//Excel File --> Workbook--> Sheets-->Rows-->Cells

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDataInSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
		
		
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\My_Dynamic_testdata_File1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Dynamic_Test_Data2");
		
		XSSFRow row=sheet.createRow(2);
		XSSFCell cell=row.createCell(1);
		cell.setCellValue("Madhukar Pandey");
		
		workbook.write(file); // attach workbook to the file 
		 
		 workbook.close();
		 file.close();
		 
		 System.out.println("File is created...");
		
	}

}
