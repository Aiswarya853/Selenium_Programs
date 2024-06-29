package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		// To find position
		
		//WebElement PositionButton= driver.findElement(By.id("position"));
		//point xypoint= PositionButton.getLocation();
		
		
		//To find colour
		
		WebElement colourButton= driver.findElement(By.id("color"));
		String colour= colourButton.getCssValue("background-color");
		System.out.println("Background colour is : " + colour);
		
		//To find Size
		WebElement sizeButton= driver.findElement(By.id("size"));
		int height= sizeButton.getSize().getHeight();
		int width= sizeButton.getSize().getWidth();
		System.out.println("Height is : " + height + "Width is : " + width);
		
		//To Click the link
		WebElement homeButton= driver.findElement(By.id("home"));
		homeButton.click();
		
		
		
		
		
		
		
		
		
		

	}

}
