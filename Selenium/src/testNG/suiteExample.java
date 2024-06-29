package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;




public class suiteExample {
	WebDriver driver;
	long startTime;
	long EndTime;
	long totalTime ;



	@BeforeSuite
	public void launchBrowser() { startTime = System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");

	driver =new ChromeDriver(opt);


	}

	@Test
	public void openGoogle() {

		driver.get("https://www.google.co.in");

	}
	@Test
	public void openBing() {

		driver.get("https://www.bing.com");

	}
	@Test
	public void openYahoo() {

		driver.get("https://www.Yahoo.com");

	}
	@AfterSuite
	public void endBrowser() {
		driver.quit();
		 EndTime = System.currentTimeMillis();
		totalTime = EndTime - startTime;
		System.out.println("total time is "+ totalTime);

	}

}
