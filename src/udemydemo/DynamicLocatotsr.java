package udemydemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLocatotsr {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\shital.shewale\\Downloads\\eclipse-java-2022-06-R-win32-x86_64\\demo\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();
	
	
	

}
}



