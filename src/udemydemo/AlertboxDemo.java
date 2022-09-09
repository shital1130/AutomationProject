package udemydemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertboxDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shital.shewale\\Downloads\\eclipse-java-2022-06-R-win32-x86_64\\demo\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());	
	//count the number of checkbox
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}
}
