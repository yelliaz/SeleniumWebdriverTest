package seleniumtest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MavenTestWikipedia {
	
  WebDriver driver;
  
  @Test
  public void f() {

		System.setProperty("webdriver.gecko.driver", System.getenv("GECKOWEBDRIVER") + "//geckodriver");

		FirefoxBinary firefoxBinary = new FirefoxBinary();
        //firefoxBinary.addCommandLineOptions("--headless");
        //firefoxBinary.addCommandLineOptions("--no-sandbox");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        WebDriver driver = new FirefoxDriver(firefoxOptions);
		
		driver.get("http://www.wikipedia.org");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
  }
  
  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
