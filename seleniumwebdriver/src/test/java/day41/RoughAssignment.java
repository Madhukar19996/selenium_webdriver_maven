package day41;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoughAssignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click(); //Click on Notification pop up 

		String filePath=System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx";
		
		int rows =ExcelUtils.getRowCount(filePath,"Sheet1");
		
		for(int i=1; i<=rows;i++)
		{
			//1) Read the data from the excel file 
			
			String IntialDepoAmount=ExcelUtils.getCellData(filePath, "Sheet1",i,0);
			String ROI=ExcelUtils.getCellData(filePath, "Sheet1",i,1);
			String Length_mon=ExcelUtils.getCellData(filePath, "Sheet1",i,2);
			String compounding=ExcelUtils.getCellData(filePath, "Sheet1",i,3);
			String total=ExcelUtils.getCellData(filePath, "Sheet1",i,4);
		    //String Exp_Mvalue=ExcelUtils.getCellData(filePath, "Sheet1",i,5);
			
			//2) Pass above data into application 
			/*driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(IntialDepoAmount);
			
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(Length_mon);
			
			
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(ROI);
			*/
			
			//Dropdown (Boostrap) - Not having Select Tag
			WebElement compoundrp = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));   //select class object compounddrp will find elelment by id
			compoundrp.click();
			
			List<WebElement> options=driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));
			//Click on calculate
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
			
			//Validation 
			String Act_Mvalue=driver.findElement(By.xpath("//p[@class='CIT-calc-result--sentence']//span[@id='displayTotalValue']")).getText();
			
			if(Double.parseDouble(total)==Double.parseDouble(Act_Mvalue))
			{
				
				System.out.println("Test Passed...");
				ExcelUtils.setCellData(filePath, "Sheet1",i, 6,"Passed");
				ExcelUtils.fillGreenColor(filePath, "Sheet1",i,6);
			}
			
			else
			{
				System.out.println("Test Failed...");
				ExcelUtils.setCellData(filePath, "Sheet1",i, 6,"Failed");
				ExcelUtils.fillRedColor(filePath,"Sheet1",i, 6);
			}
			Thread.sleep(3000);
			
			
			
		} // Ending of the for loop 
		
		 driver.quit();

	
	
}
	
}
