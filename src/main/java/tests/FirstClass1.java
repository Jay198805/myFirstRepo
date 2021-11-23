package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstClass1 {

	public  void firstClass() throws MalformedURLException
	{	
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
	
		
	}
	
}
