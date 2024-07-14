package selenium2024;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v101.input.model.MouseButton;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class allexamples {

	public static void main(String[] args) throws InterruptedException {
		// //li[@id ='menuform:j_idt40']

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.navigate().to("https://www.leafground.com/");
		driver.manage().window().maximize();
		WebElement menuElement = driver.findElement(By.xpath("//li[@id ='menuform:j_idt40']"));
		menuElement.click();
		//li[@id ='menuform:m_input']
		WebElement textBoxExamples = driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/ul/li[1]"));
		textBoxExamples.click();
		//input[@id ='j_idt88:name']
		//form[@id='j_idt88']/div[1]
		//form[@id="j_idt88"]/div[1]/div/input
		WebElement textbox1 = driver.findElement(By.xpath("//form[@id='j_idt88']/div[1]/div/input"));
		textbox1.sendKeys("Aishu");

		WebElement textbox2 = driver.findElement(By.xpath("//form[@id='j_idt88']/div[2]/div/input"));
		textbox2.sendKeys("gunasekharan");
		WebElement textbox3 = driver.findElement(By.xpath("//form[@id='j_idt88']/div[3]/div/input"));
		boolean enabled = textbox3.isEnabled();
		System.out.println("The text box is " + enabled);
		WebElement textbox4 = driver.findElement(By.xpath("//form[@id='j_idt88']/div[4]/div/input"));
		textbox4.clear();
		WebElement textbox5 = driver.findElement(By.xpath("//form[@id='j_idt88']/div[5]/div/input"));
		textbox5.getAttribute("value");
		textbox5.getText();
		WebElement textbox6 = driver.findElement(By.xpath("//form[@id='j_idt88']/div[6]/div/input"));
		textbox6.sendKeys("aiswaryag478@gmail.com"+ Keys.ENTER);
		WebElement textbox7 = driver.findElement(By.xpath("//form[@id=\"j_idt88\"]/div[7]/div/textarea"));
		textbox7.sendKeys("I am aiswarya, working in CTS as a programmar analyst in the department of automation testing");

		////form[@id="j_idt88"]/div[8]/div/div/div/span[2]/button[1]
		WebElement textbox8 = driver.findElement(By.xpath("//form[@id='j_idt88']/div[8]/div/div/div[2]/div"));
		textbox8.sendKeys
		("I am aiswarya");
		WebElement addedText = driver.findElement(By.xpath("//form[@id='j_idt88']/div[8]/div/div/div[2]/div/p"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(addedText).build().perform();
		
		WebElement bold = driver.findElement(By.xpath("//form[@id='j_idt88']/div[8]/div/div/div/span[2]/button[1]"));
		bold.click();
		////div[@class='col-12 md:col-6'][2]/div/form/div/div/input
		WebElement textbox9 = driver.findElement(By.xpath("//div[@class='col-12 md:col-6'][2]/div/form/div/div/input"));
		textbox9.sendKeys(Keys.ENTER);
		
		WebElement textAfterClick = driver.findElement(By.xpath("//span[@class ='ui-message-error-detail']"));
		System.out.println(textAfterClick.getText());
//label position-//div[@class='col-12 md:col-6'][2]/div/span/input[1]
		WebElement textbox10 = driver.findElement(By.xpath("//div[@class='col-12 md:col-6'][2]/div/span/input[1]"));
		textbox10.click();
		WebElement text = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']"));
		System.out.println("The text is:" + text.getText());
		//WebDriverWait wait = new WebDriverWait(driver, Timeout"<10>);
		Thread.sleep(2000);
				
		driver.navigate().back();
		driver.navigate().back();
		

		/*WebElement textbox11 = driver.findElement(By.xpath("//div[@class='col-12 md:col-6'][2]/div/span/input[1]"));
		textbox11.sendKeys("ais");
		List<WebElement> searchlist = driver.findElements(By.xpath("//ul[@class = 'ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li"));
       for(WebElement searchword: searchlist) {
	searchword(3);
}*/
	//	*****************************************************************************************************
		WebElement menuElement2 = driver.findElement(By.xpath("//li[@id ='menuform:j_idt40']"));
		menuElement2.click();
		//li[@id='menuform:j_idt40']/ul/li[2]/a/span
		WebElement buttonExamples = driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/ul/li[2]"));
		buttonExamples.click();
		//div[@class='grid button-demo']/div[1]/div[1]/button
		WebElement button1 = driver.findElement(By.xpath("//div[@class='grid button-demo']/div[1]/div[1]/button"));
		button1.click();
		driver.navigate().back();
		WebElement button2 = driver.findElement(By.xpath("//div[@class='grid button-demo']/div[1]/div[2]/button"));
	System.out.println("the button disabled is: " +button2.isEnabled());
	WebElement button3 = driver.findElement(By.xpath("//div[@class='grid button-demo']/div[1]/div[3]/button"));
	Point xypoint =button3.getLocation();
	int x =xypoint.getX();
	int y= xypoint.getY();
	System.out.println("the X point is:"+ x + "The Y point is: "+ y);
	//div[@class='grid button-demo']/div[1]/div[4]/button/span[1]
	WebElement button4 = driver.findElement(By.xpath("//div[@class='grid button-demo']/div[1]/div[4]/button/span[1]"));
	System.out.println(button4.getCssValue("color"));
	//div[@class='col-12 md:col-6'][2]/div[1]/button
	WebElement button5 = driver.findElement(By.xpath("//div[@class='col-12 md:col-6'][2]/div[1]/button"));
	Dimension size = button5.getSize();
	System.out.println("size is: "+ size);
	int height =size.getHeight();
	System.out.println("Height is: "+ height);
	int width= size.getWidth();
	System.out.println("width is: "+ width);
	//div[@class='col-12 md:col-6'][2]/div[2]/button
	WebElement button6 = driver.findElement(By.xpath("//div[@class='col-12 md:col-6'][2]/div[2]/button"));
	System.out.println( button6.getCssValue("background"));
	//div[@class='col-12 md:col-6'][2]/div[4]/button
	List<WebElement> button7 = driver.findElements(By.xpath("//div[@class='col-12 md:col-6'][2]/div[4]/button"));
	System.out.println( "no of buttons is: "+ button7.size());
	
	
	
	
		
		
		
		
		
	}

}
