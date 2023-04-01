package realApps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sauceDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver(co);
	d.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	d.findElement(By.id("user-name")).sendKeys("standard_user");	
	Thread.sleep(2000);
	d.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	d.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	Thread.sleep(2000);
	d.findElement(By.linkText("Sauce Labs Backpack")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();*/
		// Set the driver path
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
	//d.get("https://www.saucedemo.com/");
		                // start application
				driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
				
		                // click on date picker so that we can get the calendar in view 
				driver.findElement(By.id("datepicker")).click();
					
		                // this will find all matching nodes in calendar		
				List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				
		                // now we will iterate all values and will capture the text. We will select when date is 28
				for(WebElement ele:allDates)
				{
					
					String date=ele.getText();
					
		                        // once date is 28 then click and break
					if(date.equalsIgnoreCase("28"))
					{
						ele.click();
						break;
					}
	
	}

	}}
