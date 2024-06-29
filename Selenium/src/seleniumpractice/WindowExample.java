package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		String oldwindow =driver.getWindowHandle();
		
		WebElement firstbutton = driver.findElement(By.id("home"));
		firstbutton.click();
		
		Set<String> handles = driver.getWindowHandles();
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);	
		}
		WebElement editbox = driver.findElement(
				By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		
		driver.switchTo().window(oldwindow);
		
		WebElement multiplewindow = driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multiplewindow.click();
		int noofwindows = driver.getWindowHandles().size();
		System.out.println("No of windows : " + noofwindows);
		
		WebElement donotcloseme = driver.findElement(By.id("color"));
		donotcloseme.click();
		
		Set<String> newwindowhandles = driver.getWindowHandles();
		for (String allwindows : newwindowhandles) {
			if (!allwindows.equals(oldwindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
				
				
			}
			
		}
	driver.quit();	
		

	}

}
