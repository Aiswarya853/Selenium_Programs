package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		
		WebElement imagebutton1 = driver.findElement(By.xpath
				("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		imagebutton1.click();
		
		WebElement clickimage = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img"));
		clickimage.click();
		
		WebElement brokenimage = driver.findElement(By.xpath
				("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		if (brokenimage.getAttribute("naturalWidth").equals("0")){
			System.out.println("The image is broken" );}
		else { System.out.println("The image is not broken");}
		
			
	}	
			
		
		

	}

