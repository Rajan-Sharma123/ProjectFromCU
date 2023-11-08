package com.new1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup1 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d1.get("https://the-internet.herokuapp.com/upload");
		d1.findElement(By.id("file-upload")).sendKeys("C:\\Users\\rjraj\\OneDrive\\Documents\\Rajan Sharma\\RAJAN SHARMA\\2010991426.pptx");
		d1.findElement(By.id("file-submit")).click();
	}

}
