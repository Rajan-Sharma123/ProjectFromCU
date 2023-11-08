package com.section1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {
	public static void main(String[] args) {
		
	
	//ChromeDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no.");
		int n=sc.nextInt();
		
		switch (n) {
		case 1: {
			
			
			WebDriver driver=new ChromeDriver();
			
			break;
		}
        case 2: {
			
        	WebDriver fd=new FirefoxDriver();
			break;
		}
        case 3: {
			
        	WebDriver ed=new EdgeDriver();
			break;
		}
		default:
			System.out.println(".......");
		}

}
}
