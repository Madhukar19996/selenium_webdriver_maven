package day40;

//Excel File --> Workbook--> Sheets-->Rows-->Cells
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\My_Dynamic_testdata_File.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Dynamic_Test_Data");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter how many rows ?");
		int noofrows=sc.nextInt();
		
		System.out.println("Enter how many cells ?");
		int noofcells=sc.nextInt();
		
		for(int r=0; r<=noofrows;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			
			for(int c=0;c<noofcells;c++)
			{
			  XSSFCell cell=currentrow.createCell(c);
			  cell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file); // attach workbook to the file 
		 
		 workbook.close();
		 file.close();
		 
		 System.out.println("File is created...");
		
		
		
	}

}
