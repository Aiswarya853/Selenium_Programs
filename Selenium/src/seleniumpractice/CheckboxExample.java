package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		WebElement javacheckbox = driver.findElement(By.xpath
				("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		javacheckbox.click();
		
		WebElement seleniumchecked =driver.findElement(By.xpath
				("//*[@id=\'contentblock\']/section/div[2]/input"));
		Boolean checked = seleniumchecked.isSelected();
		System.out.println(checked);
		
		WebElement firstelement = driver.findElement(By.xpath
				("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		if (firstelement.isSelected()) {
			firstelement.click();}
			
			WebElement secondelement =driver.findElement(By.xpath
					("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
			if (secondelement.isSelected()) {
				secondelement.click();}
			
			WebElement check1=driver.findElement(By.
					xpath("//*[@id=\'contentblock\']/section/div[4]/input[1]"));
			check1.click();
			WebElement check2=driver.findElement(By.
					xpath("//*[@id=\'contentblock\']/section/div[4]/input[2]"));
			check2.click();
			WebElement check3=driver.findElement(By.
					xpath("//*[@id=\'contentblock\']/section/div[4]/input[3]"));
			check3.click();
			WebElement check4=driver.findElement(By.
					xpath("//*[@id=\'contentblock\']/section/div[4]/input[4]"));
			check4.click();
			WebElement check5=driver.findElement(By.
					xpath("//*[@id=\'contentblock\']/section/div[4]/input[5]"));
			check5.click();
			WebElement check6=driver.findElement(By.
					xpath("//*[@id=\'contentblock\']/section/div[4]/input[6]"));
			check6.click();	

	}

}
