package seleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selanium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver d=new ChromeDriver();
	d.navigate().to("http://www.google.in/");
	d.navigate().back();
	d.navigate().forward();
	d.navigate().refresh();
	d.manage().window().fullscreen();
	Thread.sleep(2000);
	d.manage().window().maximize();
	Thread.sleep(2000);
	d.manage().window().minimize();
	Thread.sleep(2000);
	
	}

}
