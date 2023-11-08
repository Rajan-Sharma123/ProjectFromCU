package com.Action1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=408191447490726425&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301992&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		Thread.sleep(2000);
		WebElement w1=d1.findElement(By.className("icp-nav-link-inner"));
		
		Actions act=new Actions(d1);
		act.moveToElement(w1).perform();
		
		Thread.sleep(2000);

		d1.findElement(By.xpath("(//span[contains(text(),'हिन्दी')])[1]")).click();
		Thread.sleep(2000);
		act.contextClick().perform();
		Robot r=new Robot();
		for(int i=0;i<10;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_DOWN);
		
	}

}
