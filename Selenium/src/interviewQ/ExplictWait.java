package interviewQ;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.annotations.FactoryAnnotation;

public class ExplictWait {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.phptravels.net/login");
		//("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement user = driver.findElement(By.xpath("//*[@id ='email']"));
		user.sendKeys("user@phptravels.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.elementToBeClickable(user));
		WebElement password = driver.findElement(By.xpath("//*[@id ='password']"));
		password.sendKeys("demouser");
		WebElement submit = driver.findElement(By.xpath("//*[@id ='submitBTN']"));
		submit.click();
		
		//WebElement clickProfile = driver.findElement
				//(By.xpath("//ul[@class='sidebar-menu list-items w-100 g-1 user_menu']/li[3]"));
		//clickProfile.click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
	//	wait.until(ExpectedConditions.elementToBeClickable(clickProfile));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		//wait.until(ExpectedConditions.elementToBeClickable(clickProfile));
		/*Wait wait = new FluentWait<>(driver)
				.withTimeouts(30, TimeUnit.SECONDS)
				.poll*/
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationfile =new File("C:\\Automation\\File");
		FileHandler.copy(sourceFile, destinationfile);
		
		
		
		

	}

}
