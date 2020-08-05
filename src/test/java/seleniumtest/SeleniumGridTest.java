package seleniumtest;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumGridTest {
  WebDriver driver;
  String baseUrl, nodeURL;
  
  @Test
  public void simpleTest() {
	  driver.get(baseUrl);
	  Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
  }
  
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  baseUrl = "http://newtours.demoaut.com/";
	  nodeURL = "http://192.168.0.19:5566/wd/hub";
	  DesiredCapabilities capability = DesiredCapabilities.firefox();
	  capability.setBrowserName("firefox");
	  capability.setPlatform(Platform.WINDOWS);
	  driver = new RemoteWebDriver(new URL(nodeURL), capability);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
