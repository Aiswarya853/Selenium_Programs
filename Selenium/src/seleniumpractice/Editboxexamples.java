package seleniumpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editboxexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		WebElement emailbox= driver.findElement(By.id("email"));
		emailbox.sendKeys("test@gmail.com");
		
		WebElement appendbox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendbox.sendKeys("Test");
		
		WebElement getTextBox= driver.findElement(By.name("username"));
		String value= getTextBox.getAttribute("value");
		 System.out.println(value);
		
		WebElement clearbox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearbox.clear();
		
		WebElement disablebox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean enabled= disablebox.isEnabled();
		System.out.println(enabled);
		
		
		
		
		

	}

}
