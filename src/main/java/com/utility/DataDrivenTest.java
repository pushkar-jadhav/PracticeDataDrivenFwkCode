package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest {
	
	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajinkya.bhobad\\Desktop\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.google.com");
    	driver.get("https://webmail.ixiasolutions.com/");
    	
    	////////////// For 1 line data in excel
    	
    	Xls_Reader reader = new Xls_Reader("Pass Path");
    	String FirstName = reader.getCellData("sheetName", "passcolName", 1);
    	String LastName = reader.getCellData("sheetName", "passcolName", 1);
    	String sample = reader.getCellData("sheetName", "passcolName", 1);
    	//
    	// Read all header cell from excel
    	//
    	//
    	driver.findElement(By.id("locator"));
    	driver.findElement(By.id("locator"));
    	driver.findElement(By.id("locator"));
    	//
    	// Find all locators required 
     	//
    	
    	
    	///////////// For Mutiple line data in excel
    	
    	int rowCount = reader.getRowCount("sheetName");
    	for(int rowNum=2;rowNum<=rowCount;rowNum++) {
    		String FirstName1 = reader.getCellData("sheetName", "firstName", rowNum);
    		String LastName1 = reader.getCellData("sheetName", "passcolName", 1);
    		//
        	// Read all header cell from excel
        	//
    		driver.findElement(By.id("locator"));
        	driver.findElement(By.id("locator"));
        	driver.findElement(By.id("locator"));
        	//
        	// Find all locators required 
         	//
    	}
    	
    	
    	///////////// Write data to in excel
    	
    	reader.setCellData("sheetName", "Status", rowCount, "PASS");

	}

}
