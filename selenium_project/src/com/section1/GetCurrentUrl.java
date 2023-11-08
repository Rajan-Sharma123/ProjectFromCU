package com.section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.flipkart.com/home-decor/paintings-posters/paintings/pr?sid=arb,bga,mmf&otracker=nmenu_sub_Home%20%26%20Furniture_0_Paintings");
		
		String current_url="https://www.flipkart.com/home-decor/paintings-posters/paintings/pr?sid=arb,bga,mmf&otracker=nmenu_sub_Home%20%26%20Furniture_0_Paintings";
		String actual_url=d1.getCurrentUrl();
	
		String current_title=d1.getTitle();
		String actual_title="Buy Wall Paintings Online in India | Flipkart.com | 10-Oct-23";
		
		
		
		if(current_url.equals(actual_url))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(current_title.equals(actual_title))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
