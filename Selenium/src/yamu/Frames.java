package yamu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//How to calculate the number of frames.
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		driver.switchTo().frame(0);
		/*How to calculate iframe with webElement.
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class= 'demo-frame']")));
		driver.findElement(By.xpath("@id='draggable'"));*/
		Actions a = new Actions(driver);
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target =driver.findElement(By.id("draggable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();//come back from frame
		

	}

}
