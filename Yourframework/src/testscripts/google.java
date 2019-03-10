package testscripts;

import org.testng.annotations.Test;

import configuration.Baseclass;

public class google extends Baseclass {
	
	@Test
	public void goToURL() {
		openBrowser("chrome", "https://www.google.com/");
	}
	
	
	
  
	


}
