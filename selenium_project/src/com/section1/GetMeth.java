package com.section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetMeth {
	public static void main(String[] args) {
		
		WebDriver d1=new EdgeDriver();
		d1.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=15630249612845096573&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302548&hvtargid=kwd-10573980&hydadcr=14453_2316415");   //right url
		//d1.get("https://www.flipkartX.com/");    //wrong url
		String check=d1.getTitle();
		
		if(check.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("Yup.........");
		}
		else
		{
			System.out.println("Wrong...");
		}
		
		
		
		
		
	}

}
