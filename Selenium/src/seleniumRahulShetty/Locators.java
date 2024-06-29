package seleniumRahulShetty;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*");    
		//Launching the browser
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String name = "rahul";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("aishu");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		//password "rahulshettyacademy"
		driver.findElement(By.xpath("//input[@placeholder ='Name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder ='Email']")).sendKeys("jhon@gmail.com");
		driver.findElement(By.xpath("//input[@type ='text'][2]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Email')]")).sendKeys("rahul@gmail.com");
		driver.findElement(By.cssSelector("input[type ='text']:nth-child(4)")).sendKeys("9894647364");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.xpath("//div[@class ='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*= 'pass']")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.id("//input[contains(@id, 'chkboxTwo')]")).click();
		driver.findElement(By.xpath("//div/span [2]")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		System.out.println(driver.findElement(By.cssSelector("div h2")).getText());
		}

}
