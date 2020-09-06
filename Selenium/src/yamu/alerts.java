package yamu;

import java.util.Iterator;
import java.util.Set;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1. Give me the count of links on the page.
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2/ How to calculate the counts of footer link
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));//limiting webdriver scope.
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3. What to calculate the links of first column.
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/body/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4. click on each link in the column and check if the pages are openings.
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinktab=Keys.chord(Keys.CONTROL, Keys.ENTER); //used to click on link and open in the new tab
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000L);
		}
			//Getting the titles of child tabs with optimized while loop
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			while(it.hasNext())//whether the next index is present or not
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
	
	}

}
