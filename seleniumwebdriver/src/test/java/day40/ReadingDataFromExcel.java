package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File --> Workbook--> Sheets-->Rows-->Cells


public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Book_Details.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		 XSSFSheet sheet=workbook.getSheet("Sheet1");
		 
		// XSSFSheet sheet=workbook.getSheetAt(0);
		
		int total_row= sheet.getLastRowNum();
		
		int total_cell=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number rows:"+total_row); //5
		System.out.println("Total number cells:"+total_cell);//4
		
		for(int r=0 ; r<=total_row; r++)
		{
			XSSFRow currentrow= sheet.getRow(r);
			
			for(int c=0; c<total_cell;c++)
			{
				XSSFCell cell =currentrow.getCell(c);
				System.out.print(cell.toString()+"   ");
				
			}
			
			System.out.println();
			
		}
		
		
		 workbook.close();
		 file.close();
		
		

	}

}
