package com.Action1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Assi7 {
	public static void main(String[] args) throws AWTException, IOException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d1.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		d1.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
		d1.findElement(By.cssSelector("[type='submit']")).click();
		d1.findElement(By.cssSelector("[href='/web/index.php/admin/viewAdminModule']")).click();
		d1.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		WebElement wb=d1.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
		wb.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		d1.findElement(By.cssSelector("[placeholder='Type for hints...']")).sendKeys("Paul  Collings",Keys.TAB,Keys.DOWN,Keys.TAB,"Garry.White123",Keys.TAB,"pwdp12345",Keys.TAB,"pwdp12345");
		d1.findElement(By.cssSelector("[type='submit']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)d1;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/image3.png");
		FileHandler.copy(src, dest);

		

	}

}
