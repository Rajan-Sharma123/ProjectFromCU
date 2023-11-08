package com.section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver b1=new ChromeDriver();
		
		b1.manage().window().maximize();
		b1.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=6490521807882948956&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302548&hvtargid=kwd-10573980&hydadcr=14453_2367553");
	    b1.navigate().to("https://www.cricbuzz.com/");
	    Thread.sleep(2000);
	    
	    b1.navigate().back();
	Thread.sleep(2000);
	b1.navigate().forward();
	Thread.sleep(2000);
	b1.navigate().refresh();
	Thread.sleep(2000);
	b1.quit();
	
	
	}
	

}
