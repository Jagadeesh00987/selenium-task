package com.sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon { 
	public static void setPropert() {


		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\JTM\\eclipse-workspace\\Maven_Poject_Class\\Driver\\chromedriver106.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement google = driver.findElement(By.xpath("//*[@type='text']"));
		google.sendKeys("java");
		List<WebElement> dropdown = driver.findElements(By.xpath("(//ul[@role='listbox'])[2]/li/descendant::div[@class='wM6W7d']"));
        System.out.println(dropdown.size());
		for (WebElement selectOptions : dropdown) {
			
			if (selectOptions.getText().equals("java compiler")) {
			
				 selectOptions.click();		   		}
			}
			}
		public static void main(String[] args) {
		setPropert();
	}
	
}	



