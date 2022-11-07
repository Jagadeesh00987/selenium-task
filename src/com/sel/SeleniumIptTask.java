package com.sel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIptTask {
	
	public static void totalProduct() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\JTM\\"
		+ "eclipse-workspace\\Maven_Poject_Class\\Driver\\chromedriver106.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.myntra.com/kids?f="
		+ "Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
	driver.manage().window().maximize();
	List<WebElement> Total = driver.findElements(By.xpath("//li[@class=\"product-base\"]"));
	int size = Total.size();
	System.out.println("Total number of product: " + size);
	List<Integer> value3=new ArrayList<>();
		List<WebElement> minValue = driver.findElements(By.xpath("//span[@class=\"product-discountedPrice\"]"));
		
		System.err.println(minValue.size());
for (WebElement valueMin : minValue) {
	
	
	String text = valueMin.getText();
	String value = text.replace("Rs. ", "");
	int value2 = Integer.parseInt(value);
	
	value3.add(value2);
}Integer min = Collections.min(value3);
System.out.println(value3);
System.out.println(min);

List<WebElement> products = driver.findElements(By.xpath(
"//li[@class='product-base']//descendant::div[@class=\"product-price\"]"
+"/span/span[text()='215']//ancestor::div[@class=\"product-price\"]"
+"//preceding-sibling::h3[@class=\"product-brand\"]"));
for (WebElement product : products) {
	String text = product.getText();
	System.out.println("the product of the minimum value :"  +text);
}	
	}
	public static void main(String[] args) {
	totalProduct();
	}

}
