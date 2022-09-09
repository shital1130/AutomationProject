package udemydemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shital.shewale\\Downloads\\eclipse-java-2022-06-R-win32-x86_64\\demo\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 1. get me the total count of link on page
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2.get me the count of footer section
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		// 3.get me the total count of footer 1st coloumn
		WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		
		//4.click on each link in the coloumn and check if the page is openning
		for(int i=1;i<column.findElements(By.tagName("a")).size();i++)
		{
			String clickonTabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickonTabs);
			Thread.sleep(3000);
		}
		Set<String>abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
