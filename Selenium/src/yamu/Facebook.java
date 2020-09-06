package yamu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver chrome;
	public void Signup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
		chrome=new ChromeDriver();
		chrome.get("https://www.facebook.com/");
		WebElement create = chrome.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
		create.click();
		WebElement pop = chrome.findElement(By.xpath("//div[@class='_8ien']"));
		List<WebElement> all =  chrome.findElements(By.xpath("//input[contains(@name,'firstname']"));
		
		
		WebElement first = chrome.findElement(By.xpath("//input[@name='firstname']"));
		first.sendKeys("Yamini");
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
