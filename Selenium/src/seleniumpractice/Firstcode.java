package seleniumpractice;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Firstcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver=new ChromeDriver(opt);
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		//driver.get("https://opensource-demo.orangehrmlive.com");
		//driver.findElement(By.id("input")).sendKeys("Agni");
		//driver.findElement(By.linkText("Go to Home Page")).click();
		//driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		
		
		//driver.quit();
		
		

	}

}
