package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.domyshoot.com/dashboard/homePage");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='__next']/div[@class='css-1uyx16w']/div[@class='styles_container__ofj4m']/div[@class='styles_container__uQ2BQ']/div[@class='styles_toolsContainer__aXoeX']/div[@class='styles_listContainer__u4M8u']/div[1]/img[1]")).click();
		Thread.sleep(2000);
		System.out.println("First upload clicked");
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1lyiwop']")).sendKeys("‪C://Users//hp//Downloads//	adc.jpg");
		System.out.println("Second Upload Clcied");
	}

}
