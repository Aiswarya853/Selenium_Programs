package selenium2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.xpath("//button[@id ='Click']"));
		frame1.click();
		String afterClick = frame1.getText();
		System.out.println(afterClick);
		//*******************************************************************************//
		driver.switchTo().defaultContent();
		//driver.switchTo().frame(1);
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		int frameSize =	totalFrames.size();
		System.out.println("Total number of frame is " + frameSize );
		//***************************************************************************//
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		
		driver.switchTo().frame("frame2");
	WebElement nestedFrame = driver.findElement(By.id("Click"));
	nestedFrame.click();
	String clicked =  nestedFrame.getText();
	System.out.println(clicked);
	
		
		

	}

}
