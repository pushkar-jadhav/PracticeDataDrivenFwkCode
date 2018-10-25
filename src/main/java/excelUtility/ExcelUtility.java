package excelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelUtility {
	
	public  String path;
	public  FileInputStream fis = null;
	public  FileOutputStream fileOut =null;
	private HSSFWorkbook workbook = null;
	private HSSFSheet sheet = null;
	private HSSFRow row   =null;
	private HSSFCell cell = null;
	private File f = null;
	String excelPath = "C:\\Users\\ajinkya.bhobad\\eclipse-workspace\\DataDrivenFWK\\src\\main\\resources\\ExcelActions.xls";
	
	public ExcelUtility() throws IOException{
			f = new File(excelPath);
			fis = new FileInputStream(f);
			POIFSFileSystem fs = new POIFSFileSystem(fis);
			workbook = new HSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
	}
	
	public void getRowCount(String sheetName) {
		int row=sheet.getLastRowNum()+1;
		System.out.println(row);
	}
	
	public void getColumnCount(String sheetName) {
		int column=sheet.getRow(0).getLastCellNum();
		System.out.println(column);
	}
	
	public boolean isSheetExist(String sheetName) throws RuntimeException
	{ 
		int index = workbook.getSheetIndex(sheetName);
		System.out.println(index);
		if(index==-1) {
			throw new RuntimeException(sheetName + "Sheet Not Present");
			}
		else
			return true;
	}
	

	public static void main(String[] args) throws IOException {
		
		ExcelUtility excel = new ExcelUtility();
		excel.getRowCount("FirstSheet");
		excel.getColumnCount("FirstSheet");
		excel.isSheetExist("FirstSheet");
	}

}
