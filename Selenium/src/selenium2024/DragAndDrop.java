package selenium2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement firstDrag = driver.findElement(By.xpath("//div[@id ='form:conpnl_header']/span"));
		firstDrag.click();
		Actions actions = new Actions(driver);
		actions.dragAndDrop(firstDrag, firstDrag).build().perform();
		System.out.println("Dragged me successfully");
		//*************************************************************//
		WebElement category = driver.findElement
				(By.xpath("//th[@id ='form:j_idt94:j_idt97']/span"));
		WebElement quantity = driver.findElement
				(By.xpath("//th[@id ='form:j_idt94:j_idt99']/span"));
		actions.dragAndDrop(quantity, category).build().perform();
		WebElement imageReSize = driver.findElement
				(By.xpath("//div[@class= 'ui-resizable-handle ui-resizable-e']"));
		Thread.sleep(4000);
		actions.click(imageReSize).dragAndDrop(imageReSize, imageReSize).build().perform();
		System.out.println("dragged size");
		WebElement drag3 = driver.findElement(By.xpath("//div[@id = 'form:drop_header']/span"));
		WebElement drag4 = driver.findElement(By.xpath("//div[@id = 'form:drag_content']/p"));
		Thread.sleep(4000);
		actions.dragAndDrop(drag4, drag3).build().perform();
		System.out.println("dragged and dropped");
		//**********************************************************************************************************//
		WebElement dragRow1 =driver.findElement(By.xpath("//tbody[@id ='form:j_idt111_data']/tr[1]/td[1]"));
		WebElement dragRow2 = driver.findElement(By.xpath("//tbody[@id ='form:j_idt111_data']/tr[8]/td[1]"));
		actions.dragAndDrop(dragRow2, dragRow1).build().perform();
		//**************************************************************************************************************//
		WebElement startButton = driver.findElement(By.xpath("//button[@id='form:j_idt119']/span"));
		WebElement cancelButton = driver.findElement(By.xpath("//button[@id='form:j_idt120']/span"));
		startButton.click();
		Thread.sleep(10000);
		WebElement valuePer =driver.findElement(By.xpath("//div[@class ='ui-progressbar-label']"));
		String per =valuePer.getText();
		System.out.println(per);
		Thread.sleep(4000);
		cancelButton.click();
		//*******************************************************************************************//
		WebElement dragLeft =driver.findElement(By.xpath("//div[@id = 'form:j_idt125']/span[1]"));
		WebElement dragRight =driver.findElement(By.xpath("//div[@id = 'form:j_idt125']/span[2]"));
		actions.dragAndDrop(dragRight, dragLeft);
		Thread.sleep(4000);
		WebElement textRange =driver.findElement(By.xpath("//span[@id = 'form:displayRange']"));
		
		String text=textRange.getText();
		System.out.println(text);
		


	}

}
