package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		Actions action  = new Actions(driver);
		System.out.println("Action class object created");
		Thread.sleep(3000);
		action.clickAndHold(driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		System.out.println("Drag and drop done");
		
		

	}

}
