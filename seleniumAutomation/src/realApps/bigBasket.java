package realApps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class bigBasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(co);
	d.get("https://www.bigbasket.com/?");
	//d.findElement(By.xpath("//*[text()='Category']")).click();
	//d.findElement(By.className("ng-binding")).click();
	//d.findElement(By.cssSelector(".ng-binding")).click();
	
	
	
	//WebElement element=d.findElement(By.xpath("//*[text()='Category']"));
	//JavascriptExecutor jse=(JavascriptExecutor) d;
	//jse.executeScript("arguments[0].scrollIntoView(true);", element);
	//jse.executeScript("javascript:window.scrollBy(0,800)");
	// jse.executeScript("window.ScrollBy(250,350)");
/*	d.findElement(By.id("input")).sendKeys("maggie");
	Thread.sleep(2000);
	d.findElement(By.xpath("//i[@class='icon svg-header svg-search svg-search-dim hidden-sm hidden-xs']")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("(//img[@class='img-responsive blur-up lazyautosizes lazyloaded'])[1]")).click();
	Thread.sleep(4000);
	d.findElement(By.xpath("//div[@class='Cs6YO rippleEffect']")).click();
	Thread.sleep(4000);
	/*WebElement curser=d.findElement(By.xpath("//*[@id=\"mainHeader\"]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/span[1]"));
	Actions act=new Actions(d);
	act.moveToElement(curser).build().perform();
	Thread.sleep(3000);
	d.findElement(By.linkText("View Basket & Checkout")).click();
	Thread.sleep(2000);
	d.findElement(By.id("otpEmail")).sendKeys("9916241059");
	//Thread.sleep(4000);
	//d.findElement(By.xpath("//*[@id=\"login\"]/login/div/form/div[1]/div/label")).sendKeys("lingarajgc102@gmail.com");
	Thread.sleep(2000);
	d.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	Thread.sleep(3000);
	d.findElement(By.id("otp")).sendKeys("239837");
	Thread.sleep(4000);
	d.findElement(By.xpath("//*[@id=\"login\"]/login/div/div[2]/form/button")).click();*/
	
	
	
	
	}

}
