package selenium2024;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowsHandlingExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver=new ChromeDriver(opt);
		driver.get("c/window.xhtml");
		WebElement window1 = driver.findElement(By.xpath("//button[@id='j_idt88:new']/span"));

		String oldWindow = driver.getWindowHandle();
		window1.click();


		Set<String> totalWindows = driver.getWindowHandles();
		Thread.sleep(4000);

		for (String newwindow : totalWindows) {
			driver.switchTo().window(newwindow);}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id='menuform:j_idt39']/a")).click();
		driver.close();

		Thread.sleep(4000);
		driver.switchTo().window(oldWindow);
		//*****************************************************************************************//
		WebElement window2 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']/span[1]"));

		String oldWindow2 = driver.getWindowHandle();
		window2.click();
		Thread.sleep(4000);
		Set<String> totalsize = driver.getWindowHandles();
		totalsize.size();
		System.out.println("Total opened windows are " + totalsize.size());

		driver.switchTo().window(oldWindow2);

		//************************************************************************************//

		WebElement window3 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']/span[2]"));

		String oldWindow3 = driver.getWindowHandle();
		window3.click();


		Set<String> totalWindowsopen = driver.getWindowHandles();
		Thread.sleep(4000);

		for (String allwindows : totalWindowsopen) {

			if(!allwindows.equals(oldWindow3)){
				driver.switchTo().window(allwindows).close();
			}

		}
		Thread.sleep(4000);
		driver.switchTo().window(oldWindow);
		
		//*******************************************************************************************//
		WebElement window4 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']/span[1]"));
        String oldWindow4 = driver.getWindowHandle();
		window4.click();
		Thread.sleep(20000);
		System.out.println("successfully completed");
		driver.switchTo().window(oldWindow4);
		driver.quit()
;


	}

}
