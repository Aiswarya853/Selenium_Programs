package interviewQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver=new ChromeDriver(opt);
		
		driver.navigate().to("https://www.phptravels.net/login");
		//("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement user = driver.findElement(By.xpath("//*[@id ='email']"));
		user.sendKeys("user@phptravels.com");
		WebElement password = driver.findElement(By.xpath("//*[@id ='password']"));
		password.sendKeys("demouser");
		WebElement submit = driver.findElement(By.xpath("//*[@id ='submitBTN']"));
		submit.click();
		WebElement clickProfile = driver.findElement
				(By.xpath("//ul[@class='sidebar-menu list-items w-100 g-1 user_menu']/li[3]"));
		clickProfile.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions)
		
		
		

	}

}
