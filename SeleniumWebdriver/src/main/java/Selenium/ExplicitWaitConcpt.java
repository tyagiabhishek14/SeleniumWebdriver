package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcpt {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.domyshoot.com/dashboard/homePage");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		clickOn(driver,driver.findElement(By.xpath("//body/div[@id='__next']/div[@class='css-1uyx16w']/div[@class='styles_container__ofj4m']/div[@class='styles_container__uQ2BQ']/div[@class='styles_toolsContainer__aXoeX']/div[@class='styles_listContainer__u4M8u']/div[1]/img[1]")), Duration.ofSeconds(20));
		
		
		

	}
	
	public static void clickOn(WebDriver driver, WebElement locator, Duration i) {
		new WebDriverWait(driver,i).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
