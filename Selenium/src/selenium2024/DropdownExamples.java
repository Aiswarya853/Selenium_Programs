package selenium2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.navigate().to("https://www.leafground.com/");
		driver.manage().window().maximize();
		WebElement menuElement = driver.findElement(By.xpath("//li[@id ='menuform:j_idt40']"));
		menuElement.click();
		//li[@id ='menuform:m_input']
		WebElement dropdownExamples = driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/ul/li[3]"));
		dropdownExamples.click();
		//div[@class='col-12'][1]
		//select[@id ='ui-selectonemenu']
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@class ='ui-selectonemenu']"));
		dropdown1.click();
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		
		select.selectByVisibleText("Puppeteer");
		//label[@id ='j_idt87:country_label']
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id ='j_idt87:country_input']"));
		dropdown2.click();
		Select select1 = new Select(dropdown2);
		select1.selectByIndex(3);
		//label[@id ='j_idt87:city_label']
		WebElement dropdown3 = driver.findElement(By.xpath("//label[@id ='j_idt87:city_label']"));
		dropdown3.click();
		List<WebElement> dropdown3list = driver.findElements(By.xpath("//ul[@id ='j_idt87:city_items']/li"));
		System.out.println(dropdown3list.size());
		//span[@class ='ui-button-text']
		WebElement dropdown4 = driver.findElement(By.xpath("//select[@id ='j_idt87:auto-complete_hinput']"));
		dropdown4.click();
		Select select2 = new Select(dropdown4);
		select2.selectByIndex(2);
		//label[@id ='j_idt87:lang_label']
		WebElement dropdown5 = driver.findElement(By.xpath("//label[@id ='j_idt87:lang_label']"));
		dropdown5.click();
		Select select3 = new Select(dropdown5);
		select3.selectByIndex(2);
		select.selectByIndex(1);
		//label[@id ='j_idt87:value_label']
		WebElement dropdown6 = driver.findElement(By.xpath("//label[@id ='j_idt87:value_label']"));
		dropdown6.click();
		select.selectByIndex(3);
		
		

	}

}
