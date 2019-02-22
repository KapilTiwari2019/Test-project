package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Baseclass {
	public WebDriver driver;
	
	
	 public void openBrowser(String browserName,String url) {
		 
		 if (browserName.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver",
					 ".\\BrowserDrivers\\geckodriver.exe");
			 
			 driver = new FirefoxDriver();
			 			 
		 }else if (browserName.equalsIgnoreCase("IE")) {
			 System.setProperty("webdriver.ie.driver",
					 ".\\BrowserDrivers\\IEDriverServer.exe");
			 
			 driver = new InternetExplorerDriver();
			 
		 }else if (browserName.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver",
					 ".\\BrowserDrivers\\chromedriver.exe");
			 
			 driver = new ChromeDriver();
			 
		 }else {
			 System.out.println("please provide valid browser name");
		 }
		 
		 driver.manage().window().maximize();
		 driver.get(url);
			 
		 
	 }
}
	