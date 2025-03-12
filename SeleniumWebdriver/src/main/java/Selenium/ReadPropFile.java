package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	
	 static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream("C://Users//hp//eclipse-workspace//SeleniumWebdriver//config.properties");
		prop.load(fi);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String s = prop.getProperty("url");
		System.out.println(s);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("Chrome")) {
			new ChromeDriver();
		}
		else {
			new FirefoxDriver();
	}
		driver.get("https://app.domyshoot.com/dashboard/homePage");
		
		

	}

}
