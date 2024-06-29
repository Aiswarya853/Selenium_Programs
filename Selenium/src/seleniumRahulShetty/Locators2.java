package seleniumRahulShetty;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*");    
		//Launching the browser
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String name = "rahul";
		String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*= 'pass']")).sendKeys(password);
		//driver.findElement(By.id("//input[contains(@id, 'chkboxTwo')]")).click();
		driver.findElement(By.xpath("//div/span [2]")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
	    Thread.sleep(1000);
	    System.out.println(driver.findElement(By.xpath("//p[text() = 'You are successfully logged in.']")).getText());
//Assert.assertEquals(driver.findElement(By.xpath("//p[text() = 'You are successfully logged in.']")).getText(),"You are successfully logged in.");
	  //p[text() = 'You are successfully logged in.']
	}
		
		public static String getpassword(WebDriver driver) throws InterruptedException {
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
			
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			String passwordoption = driver.findElement(By.cssSelector("p.infoMsg")).getText();
			//Please use temporary password 'rahulshettyacademy' to Login.
			String[] passwordarray = passwordoption.split("'");
			//String[] passwordarray2 = passwordarray[1].split("'");
			//passwordarray2[0];
			String password = passwordarray[1].split("'")[0];
			return password;
			
		}
	

}
//rahulshettyacademy