package yamu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
 
public class test {
 
public static void main(String[] args) throws InterruptedException {
 
System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
 
// Initialize browser
WebDriver driver=new ChromeDriver();
driver.get("https://blink.npit.xyz/#/user/login");
 
/* Maximize browser
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.get("https://www.google.co.in/");
driver.navigate().back();
driver.navigate().forward();
driver.close(); //it closes current browser
driver.quit();//It closes all the browser opened by selenium script*/

//LOGIN TEST CASE
driver.findElement(By.name("username")).sendKeys("admin@blink.app");
//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("divya33@gmail.com");
//driver.findElement(By.name("password")).sendKeys("1234567");
//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("1234556");
driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123463");
//driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div/div[2]/div/div[2]/form/div[4]/div[1]/button")).click();

driver.findElement(By.xpath("//button[@class='yellow-btn']")).click();
//System.out.println(driver.findElement(By.cssSelector("div.text-danger")).getText());
driver.findElement(By.cssSelector("div.text-danger")).getText();

//driver.findElement(By.className("yellow-btn")).click();
Thread.sleep(2000L);
driver.findElement(By.xpath("//input[@name='username']")).clear();
Thread.sleep(3000L);
driver.findElement(By.name("username")).sendKeys("divya@yopmail.com");
driver.findElement(By.name("password")).clear();
driver.findElement(By.name("password")).sendKeys("123456");
driver.findElement(By.className("yellow-btn")).click();
driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div/div[2]/div/div[2]/form/div[4]/div[1]/button")).click();
}
 
}