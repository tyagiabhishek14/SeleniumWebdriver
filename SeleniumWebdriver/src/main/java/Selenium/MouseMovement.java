package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		System.out.println("Action objected Created");
		action.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']"))).build().perform();
		System.out.println("Hover Donw");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='ui-id-25']")).click();
		

	}

}
