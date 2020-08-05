package seleniumtest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MavenTestWikipedia {
	
  WebDriver driver;
  
  @Test
  public void f() {
  		// this section is for on IE. (1)IEDriverServer.exe needs to be 32 bit (2) IE browser zoom level needs to be 100%
		//System.setProperty("webdriver.ie.driver", "C:\\Yiping_findjob\\Tools\\Selenium_WebDriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		//this section is for Firefox, no extra settings needed
		//System.setProperty("webdriver.gecko.driver", "C:\\Yiping_findjob\\Tools\\Selenium_WebDriver\\geckodriver_0.26.exe");
		//driver = new FirefoxDriver();
	  
	  	//this section is for chrome, no extra settings needed
		//System.setProperty("webdriver.chrome.driver", "C:\\Yiping_findjob\\Tools\\Selenium_WebDriver\\chromedriver.exe");
		String chromeResource = "./src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeResource);
		
		driver = new ChromeDriver();
		driver.get("http://www.wikipedia.org");
		driver.findElement(By.id("js-link-box-en")).click();
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@class='frb-icon-btn frb-close']")).click();
			WebElement searchBox;
			searchBox = driver.findElement(By.id("searchInput"));
			searchBox.sendKeys("Software Testing");
			searchBox.submit();
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
