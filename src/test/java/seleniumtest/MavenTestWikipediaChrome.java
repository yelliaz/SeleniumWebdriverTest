package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MavenTestWikipediaChrome {
	
  WebDriver driver;
  
  @Test
  public void f() {
	  	//Firefox on Windows works without firefoxBinary.addCommandLineOptions("--headless")
	    /*
		System.setProperty("webdriver.gecko.driver", System.getenv("GECKOWEBDRIVER") + "//geckodriver.exe");

		FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        firefoxBinary.addCommandLineOptions("--no-sandbox");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        driver = new FirefoxDriver(firefoxOptions);
        */
		
		System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEWEBDRIVER") + "//chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		options.setAcceptInsecureCerts(true);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.wikipedia.org");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		
		}
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
	  System.out.println("The testing is finished chrome");
  }

}
