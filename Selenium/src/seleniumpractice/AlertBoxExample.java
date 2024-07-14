package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertBoxExample {

	public static void main(String[] args)  {
		/*// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		WebElement Alertbox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		Alertbox.click();
		Alert alertpopup = driver.switchTo().alert();
		alertpopup.accept();
		
		
		WebElement confirmbox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmbox.click();
		Alert confirmalertbox = driver.switchTo().alert();
		confirmalertbox.dismiss();
		
		
		WebElement promptbox= driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
		Alert promptalertbox= driver.switchTo().alert();
		promptalertbox.sendKeys("selflove");
		promptalertbox.accept();
		
		
		
		WebElement linebreakbox=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button"));
		linebreakbox.click();
		Alert breakbox = driver.switchTo().alert();
		breakbox.accept();
		}

}
