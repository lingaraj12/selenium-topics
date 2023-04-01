import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class axisbankAutomation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeOptions op=new ChromeOptions();
		op.setImplicitWaitTimeout(Duration.ofSeconds(40));
		op.addArguments("--disable--notifications");
		WebDriver d=new ChromeDriver(op); 
		d.get("https://www.axisbank.com/"); 
		//d.findElement(By.id("email")).sendKeys("8861090135");
		//d.findElement(By.id("pass")).sendKeys("@5perd1A");
		//d.findElement(By.xpath("//button[text()='Log in']")).click();
	//Alert alert=d.switchTo().alert();
//	alert.dismiss();
	d.findElement(By.xpath("//span[text()='X']")).click();
	d.findElement(By.linkText("Login")).click();
	d.findElement(By.linkText("Register")).click();
	
	
	
	
	
	
	}
}
