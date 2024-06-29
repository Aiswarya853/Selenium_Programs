package seleniumpractice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		WebElement dropdownButton1 = driver.findElement(By.id("dropdown1"));
		Select selectbutton1 = new Select(dropdownButton1);
		selectbutton1.selectByIndex(1);
		
		WebElement dropdownButton2 = driver.findElement(By.name("dropdown2"));
		Select selectbutton2 = new Select(dropdownButton2);
		selectbutton2.selectByValue("2");
		
		WebElement dropdownButton3 = driver.findElement(By.id("dropdown3"));
		Select selectbutton3 = new Select(dropdownButton3);
		selectbutton3.selectByVisibleText("Loadrunner");
		
		WebElement dropdownButton4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select selectbutton4 = new Select(dropdownButton4);
		List<WebElement> listofoptions = selectbutton4.getOptions();
		int size=  listofoptions.size();
		System.out.println("No of options : " + size);
		
		WebElement dropdownButton5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		dropdownButton5.sendKeys("UFT/QTP");
		
		WebElement dropdownButton6 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select selectbutton6 = new Select(dropdownButton6);
		
		selectbutton6.selectByIndex(1);
		selectbutton6.selectByIndex(2);
		selectbutton6.selectByIndex(3);
		//selectbutton6.selectByValue("1");
		//selectbutton6.selectByValue("2");
		
		
		
		
		
	}

}
