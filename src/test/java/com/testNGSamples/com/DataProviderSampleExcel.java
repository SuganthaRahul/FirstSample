package com.testNGSamples.com;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderSampleExcel {
	@DataProvider(name="SampleTest", parallel=true)
		public Object[][] excelTest() throws Exception {
		Object[][] arObj=getExcelData("C:\\Users\\HP\\eclipse-workspace\\TestNGSamples\\src\\test\\resources\\testdata.xlsx","Sheet1");
		return arObj;
	}

	public static Object[][] getExcelData(String FilePath, String SheetName) throws Exception {   

		   String[][] value = null;
		   try {
			   XSSFWorkbook wb=new XSSFWorkbook(FilePath);
			   XSSFSheet sheet=wb.getSheet("Sheet1");
			   XSSFRow row=sheet.getRow(0);
			   int rowCount=sheet.getPhysicalNumberOfRows();
			   int colCount=row.getPhysicalNumberOfCells();
				Cell cell;
				value=new String[rowCount][colCount];
			   
				for (int i = 0; i < rowCount; i++) {
					for (int j = 0; j < colCount; j++) {
						row=sheet.getRow(i);
						cell=row.getCell(j);
						value[i][j]=cell.getStringCellValue();
						
						
					}
				}
				
		   } catch(Exception e){
			   System.out.println(e);
		   }
		return value;

		  
}
}