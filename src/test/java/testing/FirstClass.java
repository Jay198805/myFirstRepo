package testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FirstClass {

	@Test
	public  void firstClass() throws MalformedURLException, InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", "D:\\Jayaram\\CHROMEDRIVER\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
		Thread.sleep(10000);
		driver.close();
	
		
	}
	
}
