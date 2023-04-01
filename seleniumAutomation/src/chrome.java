import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class chrome {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//to fetch current indian standerd time in google
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("current IST TIME");
		Thread.sleep(4000);
		driver.findElement(By.name("btnK")).click()	;
		/*//driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		//String time=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).getText();
		Thread.sleep(2000);
		//String time=driver.findElement(By.xpath("//div[@role='heading' and @class='gsrt vk_bk FzvWSb YwPhnf' ]")).getText();
	String time=driver.findElement(By.xpath("//div[@class='gsrt vk_bk FzvWSb YwPhnf']")).getText();
		String currenttime="8:21 pm";
          System.out.println("current time : " +time);
		// Assert.assertTrue(time.contains(currenttime));
		//Reporter.log(currenttime,true);
		//assert 
		if(time.contains(currenttime))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		//get current system date
	   // String date=	driver.findElement(By.xpath("//span[text()='31 January 2023']")).getText();
		//System.out.println(date);*/

		String time=driver.findElement(By.xpath("//div[@class='gsrt vk_bk FzvWSb YwPhnf']")).getText();
		String currenttime="9:24 pm";

		//assert 
		if(time.contains(currenttime))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		// to fetch current sytem time 
		//LocalTime time2 = LocalTime.now();
		System.out.println("Current time: "+time);
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		//String date1= dateFormat.format(date);
		System.out.println(dateFormat.format(date));
	}


}



