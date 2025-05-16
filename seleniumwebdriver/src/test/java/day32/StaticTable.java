package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//1) Find total number of rows in a table 
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		//int rows=driver.findElements(By.tagName("tr")).size(); // Single table in a web page 
		System.out.println("Number of Rows in Table:"+rows); //7
		
		//2) Find total number of columns in a table 
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();// multiple tables 
		// int columns=driver.findElements(By.tagName("th")).size(); // Single table in a web page
		 System.out.println("Number of columns in Table:"+columns);//4
		 
		 
		//3) Read data from specific row/column (Ex : 3th row and 3th column)
		 String Subject=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[3]")).getText();
		 System.out.println(Subject);
		 
		 //4) Read data from all the rows and columns 
		 /*
		 System.out.println("Bookname" +"\t"+"Author"+"\t"+"Subject"+"\t"+"Price"+"\t");
		 for(int r=2; r <= rows;r++)
		 {
			 for(int c=1; c<=columns;c++)
			 {
				 String table_data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				 System.out.print(table_data+"\t");
			 }
			 System.out.println();
		 }
		*/
		 
		 // Print book names whose author is Amit
		 
		/* for(int r=2;r<=rows;r++)
		 {
			 String Authorname=driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			 
			 if(Authorname.equals("Amit"))
			 {
				 String Bookname=driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				 System.out.println(Authorname+"\t"+Bookname);
			 }
			 
		 }
		*/
		 
		//6) Find total price for all the books
		 int total=0;
		 for(int r=2;r<=rows;r++)
		 
		 {
			 String Price=driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			 total=total+Integer.parseInt(Price);
			 
		}
		 System.out.println("Total number  prices of all books:"+total); //7100
		
		
		

	}

}
