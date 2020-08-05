package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGetCommands {
	WebDriver driver;
	
	@Test
	public void seleniumTest() {
		//getCommands();
		//navigateCommands();
		findElemens();
	}
	
	public void getCommands() {
		try {
			// get()
			driver.get("http://www.amazon.in");
			// getTitle()
			System.out.println("The title of the page is " + driver.getTitle());
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("face mask");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
			Thread.sleep(2000);
			// getCurrentUrl()
			String currentURL = driver.getCurrentUrl();
			System.out.println("The current URL is " + currentURL);
			// getPageSource()
			System.out.println("The page source code is " + driver.getPageSource());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void navigateCommands() {
		try {
			driver.navigate().to("http://www.amazon.in");
			driver.findElement(By.linkText("Best Sellers")).click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void findElemens() {
		try {
			driver.get("http://www.amazon.in");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("face mask");
			driver.findElement(By.className("nav-input")).click();
			driver.navigate().back();
			driver.findElement(By.linkText("Customer Service")).click();
			driver.navigate().back();
			driver.findElement(By.partialLinkText("Sellers")).click();
			driver.navigate().back();
			driver.get("http://www.facebook.in");
			driver.findElement(By.cssSelector("input#email")).sendKeys("xyz@gmail.com");
			driver.findElement(By.cssSelector("label._58mt")).click(); //female radio button
			driver.findElement(By.tagName("button")).click();
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Yiping_findjob\\Tools\\Selenium_WebDriver\\chrome_80.0.3987.106\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
