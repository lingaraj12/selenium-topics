package realApps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class healthKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.healthkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"hk-header-wrapper\"]/div/section[2]/div/div/div/ul/li[1]/a/button/span"));
	Actions action=new Actions(driver);
	//action.moveToElement(dropdown).build().perform();
	WebElement dp=driver.findElement(By.linkText("Fitness"));
	action.moveToElement(dp).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Smart Watches")).click();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"categoryLevel2_variantResultView__3qX5d\"]/div[2]/div[1]/div/div/div/div/div/a")).click();
	try {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[3]/div[1]/section/div[2]/div[3]/div[1]/span[3]/span")).click();
	}catch(NoSuchElementException e) {
		System.out.println("handle nosuchelement exception");
	}
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[3]/div[1]/section/div[2]/div[3]/div[1]/span[3]/span")).click();

	
	}

}
