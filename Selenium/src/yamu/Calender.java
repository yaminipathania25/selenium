package yamu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Generic method to open calendar
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("//*[@id='departureCalendar']")).click();
		while(!driver.findElement(By.cssSelector("[class='DayPicker-Month'] [class='DayPicker-Caption']")).getText().contains("June"));
		{
			driver.findElement(By.cssSelector("[class='DayPicker-Month']  [class='DayPicker-Body'] [class='DayPicker-Week']")).click();
		}
		List<WebElement> dates=driver.findElements(By.className("DayPicker-Month"));
		//Grab common attribute//Put into list and itarate
		int count = driver.findElements(By.className("DayPicker-Month")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("DayPicker-Month")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("DayPicker-Month")).get(i).click();
				break;
			}
		}
	}

}
