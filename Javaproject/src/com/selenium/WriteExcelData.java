package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelData {
@Test
	public void main() throws Exception {
		// TODO Auto-generated method stub
  FileInputStream fis=new FileInputStream("E:\\Selenium_Student_SW\\WriteData.xlsx");
  XSSFWorkbook workbook=new XSSFWorkbook(fis);
  XSSFSheet sheet=workbook.getSheet("test");
  System.out.println(sheet.getSheetName());
  System.out.println(sheet.getLastRowNum());
  System.out.println("Before updating celldata" + sheet.getRow(2).getCell(1));
  // write the data to excel file
  XSSFCell cell=sheet.getRow(2).getCell(1);
  cell.setCellValue("Test123");
  fis.close();
  FileOutputStream fileout=new FileOutputStream("E:\\Selenium_Student_SW\\WriteData.xlsx");
  workbook.write(fileout);
  System.out.println("Updated data after write is done" + cell.getStringCellValue());
  fileout.close();
	}

}
