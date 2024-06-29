package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothInCrt {
	@Test
	@Parameters({"username", "password"})
	public void bothInCrt(String uname, String pword) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);

	WebElement userName =	driver.findElement(By.xpath("//input[@name =\"username\"]"));
	userName.sendKeys(uname);
	WebElement passWord = driver.findElement(By.xpath("//input[@name =\"password\"]"));
	passWord.sendKeys(pword);
	WebElement loginClick =driver.findElement
			(By.xpath("//button[@class =\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
		loginClick.click();
		driver.quit();
}}
