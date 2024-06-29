package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		
		WebElement below20= driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]"));
		below20.click();
		
		WebElement unchecked= driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));
		boolean unticked = unchecked.isSelected();
		
		WebElement checked = driver.findElement(By.xpath
				("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		boolean ticked = checked.isSelected();
		System.out.println(unticked);
		System.out.println(ticked);
		
		
		

	}

}
