package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
	d.get("https://www.yatra.in");
	Thread.sleep(4000);
	d.findElement(By.xpath("(//input[@name='flight_origin_date'])[1]")).click();
	Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
