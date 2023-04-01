package seleniumAutomation;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com");
		Thread.sleep(4000);
		WebElement d=driver.findElement(By.xpath("//*[text()='Support ']"));
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(d).perform();		
		Thread.sleep(2000);
driver.findElement(By.linkText("Contact Us")).click();
	
	}}