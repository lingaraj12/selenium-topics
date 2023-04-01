package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		Actions act=new Actions(d);
		WebElement source=d.findElement(By.xpath(null));
		WebElement target=d.findElement(By.xpath(null));
		act.dragAndDrop(source, target).perform();
		Thread.sleep(4000);
		
	}

}
