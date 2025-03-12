package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.domyshoot.com/dashboard/homePage");
		driver.manage().window().maximize();
		driver.switchTo().frame(1);
		// driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("Write you xpath")).click();
		

	}

}
