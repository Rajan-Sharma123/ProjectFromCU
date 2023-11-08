package com.new1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi9 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjwv-2pBhB-EiwAtsQZFOrhC6mIaafXflXLDxDTAiJlT6XQbjcBuZTgc2Lhe381MtKyzcABhxoCWiEQAvD_BwE&gclsrc=aw.ds");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d1.findElement(By.cssSelector("[id='name']")).sendKeys("Rajan Sharma",Keys.TAB,"rjrajan136@gmail.com",Keys.TAB,"rjrajn#123",Keys.TAB,"7627868310");
		d1.findElement(By.cssSelector("[src='//static.naukimg.com/s/7/104/assets/images/schoolbag.a54cbf7a.svg']")).click();
		d1.findElement(By.cssSelector("[name='currentCity']")).sendKeys("Patiala");
		d1.findElement(By.cssSelector("[class='dd_bold']")).click();
		d1.findElement(By.className("uploadResume")).click();
		
		
		StringSelection path=new StringSelection("C:\\Users\\rjraj\\Downloads\\RajanSharma2010991426.pdf.pdf");
		Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(path,null);
		
		Thread.sleep(2000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
		
		
		
	}

}
