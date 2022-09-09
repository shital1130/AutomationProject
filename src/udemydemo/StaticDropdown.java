package udemydemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shital.shewale\\Downloads\\eclipse-java-2022-06-R-win32-x86_64\\demo\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement drp =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s1 = new Select(drp);
		s1.selectByIndex(3);
		//s1.selectByVisibleText("USD");
		System.out.println(s1.getFirstSelectedOption().getText());
	}

}
