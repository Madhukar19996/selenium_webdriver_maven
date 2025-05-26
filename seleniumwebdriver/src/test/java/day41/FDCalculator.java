package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	    public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click(); //Click on Notification pop up 
		
		String filePath=System.getProperty("user.dir")+"\\testdata\\Caldata.xlsx";
		
		int rows =ExcelUtils.getRowCount(filePath,"Sheet1");
		
		for(int i=1; i<=rows;i++)
		{
			//1) Read the data from the excel file 
			
			String priciple=ExcelUtils.getCellData(filePath, "Sheet1",i,0);
			String ROI=ExcelUtils.getCellData(filePath, "Sheet1",i,1);
			String Period1=ExcelUtils.getCellData(filePath, "Sheet1",i,2);
			String Period2=ExcelUtils.getCellData(filePath, "Sheet1",i,3);
			String fre=ExcelUtils.getCellData(filePath, "Sheet1",i,4);
			String Exp_Mvalue=ExcelUtils.getCellData(filePath, "Sheet1",i,5);
			
			//2) Pass above data into application 
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(priciple);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(ROI);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(Period1);
			Select Period2_drp= new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			Period2_drp.selectByContainsVisibleText(Period2);
			Select fredrp=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrp.selectByContainsVisibleText(fre);
			
			//Click on calculate
			driver.findElement(By.xpath("//div[@class='CTR PT15']")).click();
			
			//Validation 
			String Act_Mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(Exp_Mvalue)==Double.parseDouble(Act_Mvalue))
			{
				
				System.out.println("Test Passed...");
				ExcelUtils.setCellData(filePath, "Sheet1",i, 7,"Passed");
				ExcelUtils.fillGreenColor(filePath, "Sheet1",i,7);
			}
			
			else
			{
				System.out.println("Test Failed...");
				ExcelUtils.setCellData(filePath, "Sheet1",i, 7,"Failed");
				ExcelUtils.fillRedColor(filePath,"Sheet1",i, 7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			
			
		} // Ending of the for loop 
		
		 driver.quit();

	}

}
