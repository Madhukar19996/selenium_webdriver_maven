package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); // acccept SSL certificate
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println("Tittle of the web page:"+driver.getTitle());  //Privacy error 
		
		                                                                  //expired.badssl.com
	}

}
