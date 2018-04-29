package com.selnium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class Driver {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	driver.get("http://www.softwaretestingmaterial.com/");
  }
  
  @BeforeClass
  public void beforeClass() {
	  String path =System.getProperty("user.dir");
	  System.setProperty("webdriver.gecko.driver",path+"\\Driver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
	  System.out.println("Test Firefox driver open");
	  
  }
 
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
}