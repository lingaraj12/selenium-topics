package realApps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;


public class freshToHome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver();
	d.get("https://www.freshtohome.com/");
	Thread.sleep(2000);
	d.findElement(By.id("autoComplete")).sendKeys("560001");
	Thread.sleep(2000);
	d.findElement(By.id("autoComplete_list_1")).click();
	Thread.sleep(2000);
	d.findElement(By.id("continueBtn")).click();
	   Thread.sleep(2000);
	  // d.findElement(By.id("search")).sendKeys("chicken");
	   Thread.sleep(2000);
	   d.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div/button/span")).click();
	   Thread.sleep(2000);
	   d.findElement(By.xpath("//*[@id=\"products\"]/div[2]/div[3]/a/div/div[2]")).click();
	   Thread.sleep(2000);
	   d.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	   Thread.sleep(6000);
  	   d.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[3]/div[7]/div[2]/button/span/span")).click();
	   Thread.sleep(4000);
	   d.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[5]/div[2]")).click();
	   Thread.sleep(4000);
//	Set<String>st=d.getWindowHandles();
//	for(String st1:st) {
//	String str=d.switchTo().window(st1).getTitle();
//	System.out.println(str);
//	d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	WebDriverWait wait= (new WebDriverWait(driver, 5));
//	wait.until(ExpectedConditions . elementToBeClickable (By.id("element id")));
//	//alternate solution
//	wait.until(ExpectedConditions. invisibilityOfElementLocated(By.id("overlay element id")));
//	//fix with JavaScript executor
	WebElement m = d.findElement(By.xpath("//*[@id=\"ajaxscicon\"]/div/div/div[2]"));
    JavascriptExecutor jse = (JavascriptExecutor) d;
	jse.executeScript("arguments[0].click();", m);
	Thread.sleep(2000);
	d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement m1 =d.findElement(By.xpath("//button[text()='Checkout']"));
    JavascriptExecutor jse1 = (JavascriptExecutor) d;
	jse.executeScript("arguments[0].click();", m1);

		
	
	
	

//	
//	d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	 d.findElement(By.linkText("//*[@id=\"ajaxscicon\"]/div/div/div[2]")).click();
//	 d.findElement(By.xpath("//button[text()='My Cart']")).click();
	}

}
