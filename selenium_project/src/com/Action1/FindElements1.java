package com.Action1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=11014099981768027878&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302548&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		Thread.sleep(2000);
		d1.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
		
		 List<WebElement> ans=d1.findElements(By.cssSelector("[class='a-price-whole']"));
		 List<WebElement> ans2=d1.findElements(By.cssSelector("[class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")); 
		 
		 for(WebElement op:ans)
		 {
			 System.out.println(op.getText());
		 }
		
	}

}
