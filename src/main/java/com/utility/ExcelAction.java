package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelAction {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajinkya.bhobad\\Desktop\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Xls_Reader xls=new Xls_Reader("C:\\Users\\ajinkya.bhobad\\Desktop\\ExcelActions.xlsx");
		xls.getRowCount("sheet1");
		

	}

}
