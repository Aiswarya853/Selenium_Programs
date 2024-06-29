package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ParallelTesting {

	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		WebDriver driver =new ChromeDriver(opt);
		driver.get("https://www.google.co.in");
		driver.quit();
	}
	@Test
	public void openYahoo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		WebDriver driver =new ChromeDriver(opt);
		driver.get("https://www.Yahoo.com");
		driver.quit();
	}
	
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		WebDriver driver =new ChromeDriver(opt);
		driver.get("https://www.bing.com");
		driver.quit();
	}

}
