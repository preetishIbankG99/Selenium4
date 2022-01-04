package com.seltest.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class DemSel4 {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		   System.setProperty("webdriver.chrome.driver","../Selenium4Test/Drivers/chromedriver.exe");
           driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://opensource-demo.orangehrmlive.com/");
           
           WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
           File file=logo.getScreenshotAs(OutputType.FILE);
           File destfile=new File("logo.png");      
	       FileHandler.copy(file, destfile);
	}

}
