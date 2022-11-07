package com.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	public static void HandsOn() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\JTM\\eclipse-workspace\\Maven_Poject_Class\\Driver\\chromedriver106.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	
	String window1 = driver.getWindowHandle();
	WebElement text = driver.findElement(By.id("name"));
	text.sendKeys("aaaa");
	String title1= driver.getTitle();
	System.out.println(title1);
	WebElement link = driver.findElement(By.id("newWindowBtn"));
	link.click();
	Set<String> window2= driver.getWindowHandles();
	for (String newWindow : window2) {
		driver.switchTo().window(newWindow);
		}
	WebElement text2 = driver.findElement(By.id("firstName"));
	text2.sendKeys("bbb");
	String title2 = driver.getTitle();
	System.out.println(title2);
	driver.close();
	driver.switchTo().window(window1);

	}public static void main(String[] args) {
		HandsOn();
	}

}
