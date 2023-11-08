package com.new1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\rjraj\\OneDrive\\Documents\\TestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("sheet1");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		String name=cell.getStringCellValue();
		Cell cell2=row.getCell(1);
		String pwd=cell2.getStringCellValue();
		
		System.out.println(cell);
		System.out.println(cell2);
		
	}

}
