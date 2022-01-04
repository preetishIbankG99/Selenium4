package com.seltest.demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingTabs {
public static WebDriver driver;
public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","../Selenium4Test/Drivers/chromedriver.exe");
	           driver=new ChromeDriver();
	           driver.manage().window().maximize();
	           driver.get("https://opensource-demo.orangehrmlive.com/");
	          // driver.switchTo().newWindow(WindowType.WINDOW);
	           //driver.switchTo().newWindow(WindowType.TAB);
               driver.navigate().to("https://www.google.co.in/");
               Thread.sleep(4000);
               driver.close();
}

}
