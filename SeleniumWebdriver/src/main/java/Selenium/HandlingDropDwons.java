package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDwons {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Before Xpath");
		//Select select = new Select(driver.findElement(By.xpath("//span[normalize-space()='Women']")));
		//System.out.println("After Xpath");
		//select.deSelectByContainsVisibleText("Tops");
		
		WebElement dropdown = driver.findElement(By.xpath("//span[normalize-space()='Women']"));
		dropdown.click();
		
		WebElement option  = driver.findElement(By.xpath("//a[@id='ui-id-9']"));
		option.click();		
		// First i have getting error that drop down should be select type but getting span.
		// So i used web element class.
		// At last understood that it was a mouse hover functionality.
		
		// Leaving this program as it as, we use Select class to hand drop down.

	}

}
