package com.Action1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass4 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		d1.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=11650331857414013969&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302548&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		d1.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
		d1.findElement(By.cssSelector("[data-image-index='1']")).click();
		d1.findElement(By.cssSelector("[data-image-index='2']")).click();
		d1.findElement(By.cssSelector("[data-image-index='3']")).click();
		
		
		String w1=d1.getWindowHandle();
		Set<String> all_id=d1.getWindowHandles();
		
		for(String id:all_id)
		{
			d1.switchTo().window(id);
			if(d1.getCurrentUrl().contains("https://www.amazon.in/Apple-iPhone-13-128GB-Midnight/dp/B09G9HD6PD/ref=sr_1_1_sspa?keywords=iphone&qid=1698210707&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1"))
			{
				d1.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				
			}
			else if(d1.getCurrentUrl().contains("https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX2F5QT/ref=sr_1_2_sspa?keywords=iphone&qid=1698210707&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1"))
			{
				d1.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			
			}
			else if(d1.getCurrentUrl().contains("https://www.amazon.in/Apple-iPhone-15-Pro-256/dp/B0CHWZ86W2/ref=sr_1_3?keywords=iphone&qid=1698210707&sr=8-3&th=1"))
			{
				d1.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			
			}
		}
		//d1.switchTo().window(w1);
		
		
		
		
	}

}
