package com.sel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static WebDriver driver;
	private static Integer min;
	public static void allProduct() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JTM\\eclipse-workspace\\Maven_Poject_Class\\Driver\\chromedriver106.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f="
				+ "Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class=\"product-base\"]"));

		int size = elements.size(); System.out.println("number of products" + size);
	}
	public static void minimumPrice() {
		//minimum price
	// driver= new ChromeDriver();
		List<Integer> priceList = new ArrayList<>();
		List<WebElement> findElements = driver.findElements(By.xpath("(//li[@class=\"product-base\"])[1]/a/div[2]/div"));
		for (WebElement singlePrice: findElements) {
			String value = singlePrice.getText();

			Integer parseInt1 = Integer.parseInt(value);
			priceList.add(parseInt1);
		}
		min = Collections.min(priceList);
		System.out.println(min);
	}
			//minimum price text
	public static void MinimumText() {
		driver= new ChromeDriver();
		List<String> minText1 = new ArrayList<String>();
		List<WebElement> element = driver.findElements(By.xpath("(//li[@class=\"product-base\"])[1]/a/div[2]/div"));
		for (WebElement minText : element) {
			String text = minText.getText();
			minText1.add(text);			
}
		String min2 = Collections.min(minText1);
	    System.out.println(min2);	
	}
	public static void main(String[] args) {
		
		allProduct();MinimumText();
		minimumPrice();
		
		
	}
}
