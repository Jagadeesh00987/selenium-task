package com.sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonweb_Exm {

	public static void webAmazon() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\JTM\\eclipse-workspace\\Maven_Poject_Class\\Driver\\chromedriver106.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Amazonfp = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Amazonfp.sendKeys("soft toys");
		List<WebElement> option = driver.findElements
				(By.xpath("//div[@id='nav-flyout-searchAjax']/div/descendant::div[2]/div[@role='button']"+"//div[@role='button']/span"));
		System.out.println(option);
		for (WebElement webElement : option) {
			if (webElement.getText().equals("soft toys kids")) {
				webElement.click();
				break;

			}
		}

	}public static void main(String[] args) {
		webAmazon();







	}


}