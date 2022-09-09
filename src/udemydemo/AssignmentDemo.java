package udemydemo;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class AssignmentDemo {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shital.shewale\\\\Downloads\\\\eclipse-java-2022-06-R-win32-x86_64\\\\demo\\\\chromedriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		// inspect checkbox square
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		// get text of that checkbox
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		// inspect drop down
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

		Select s = new Select(dropdown);

		s.selectByVisibleText(opt);

		driver.findElement(By.name("enter-name")).sendKeys(opt);

		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();

		if (text.contains(opt))

		{

			System.out.println("Alert message success");

		}

		else

			System.out.println("Something wrong with execution");

	}

	

}