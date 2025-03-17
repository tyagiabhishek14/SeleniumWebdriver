package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"/Users/abhishektyagi/git/SeleniumWebdriver/SeleniumWebdriver/config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url = prop.getProperty("url");
		System.out.println(url);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.cssSelector(".styles_buttonGradient__L4b__.user-selection-disable")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//div[@class='css-17catiw']")).click(); 

	}

}
