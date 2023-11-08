package com.new1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assi12 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\rjraj\\OneDrive\\Documents\\TestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("sheet1");
		Row row=sheet.getRow(2);
		String sname=row.getCell(0).getStringCellValue();
		String lname=row.getCell(1).getStringCellValue();
		String mobile=row.getCell(2).getStringCellValue();
		String pwd=row.getCell(3).getStringCellValue();
		String day=row.getCell(4).getStringCellValue();
		String month=row.getCell(5).getStringCellValue();
		String year=row.getCell(6).getStringCellValue();
		String url=row.getCell(7).getStringCellValue();
		
		
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get(url);
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d1.findElement(By.cssSelector("[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		d1.findElement(By.cssSelector("[name='firstname']")).sendKeys(sname,Keys.TAB,lname,Keys.TAB,mobile,Keys.TAB,pwd);
		
		
		WebElement e1=d1.findElement(By.id("day"));
		Select s1=new Select(e1);
		s1.selectByVisibleText(day);
		
		WebElement e2=d1.findElement(By.id("month"));
		Select s2=new Select(e2);
		s2.selectByVisibleText(month);
		
		WebElement e3=d1.findElement(By.id("year"));
		Select s3=new Select(e3);
		s3.selectByVisibleText(year);

		
		
		d1.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
		
		
		
		
		
	}

}
