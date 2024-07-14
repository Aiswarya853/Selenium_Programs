package selenium2024;
//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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.netty.channel.MessageSizeEstimator.Handle;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement alert1 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']/span[2]"));
		alert1.click();
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		WebElement msgAfterClick = driver.findElement(By.xpath("//span[@id='simple_result']"));
		String text = msgAfterClick.getText();
		System.out.println(text);
		//*********************************************************************************//

		WebElement alert2 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']/span[2]"));
		alert2.click();
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		WebElement confirmDialouge = driver.findElement(By.xpath("//span[@id='result']"));

		String text2 = confirmDialouge.getText();
		System.out.println(text2);
		//*******************************************************************************************//
		//button[@id='j_idt88:j_idt95']/span[2]
		WebElement alert3 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']/span[2]"));
		alert3.click();
		Alert sweetAlert = driver.switchTo().alert();
		//Thread.sleep(2000);
		sweetAlert.dismiss();
		//WebElement dismiss = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']/span[2]"));
		//dismiss.click();
		//****************************************************************************************//
		//button[@id='j_idt88:j_idt100']/span[2]
		WebElement alert4 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/span[2]"));
		alert4.click();
		driver.switchTo().alert();
		driver.close();
	}

}
