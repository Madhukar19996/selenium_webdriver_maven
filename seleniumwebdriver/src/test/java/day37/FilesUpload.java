package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilesUpload {

	public static void main(String[] args) {
		
		
        WebDriver driver= new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		
		//Single file upload -- Day24
		/*
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Madhukar Pandey\\Desktop\\Sales Data.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Sales Data.txt"))
		{
			System.out.println("File is sucessfully uploaded ");
		}
		
		else
		{
			System.out.println("File is not uploaded ");
		}
     */
		
		//Multiple files uploaded
		String file1="C:\\Users\\Madhukar Pandey\\Desktop\\Sales Data.txt";
		String file2="C:\\Users\\Madhukar Pandey\\Desktop\\API_Test_Cases.csv";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int Nooffilesuploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		//validation 1 : Number of files 
		if(Nooffilesuploaded==2)
		{
			System.out.println("All files are uploaded");
		}
		else
		{
			System.out.println("Files are not uploaded or incorrect files uploaded ");
		}
		
		//validation 1 : name of files 
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Sales Data.txt") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("API_Test_Cases.csv"))
		{
			System.out.println("Files name are matching ");
		}
		else
		{
			System.out.println("Files name are not matching ");
		}
	}

}
