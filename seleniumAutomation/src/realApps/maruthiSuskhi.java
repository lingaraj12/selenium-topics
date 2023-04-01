package realApps;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class maruthiSuskhi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Automation of marutthi suzkhi
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
	WebDriver d=new ChromeDriver(); 
	d.navigate().to("https://www.marutisuzuki.com/"); 
	Thread.sleep(2000); 
		//d.manage().window().maximize(); 
	d.findElement(By.xpath("//*[@id='main-header-3']")).click();
	Thread.sleep(2000); 
	d.findElement(By.xpath("(//div[@class='arrow-top arrow']/../span)[4]")).click();
	Thread.sleep(2000); 
	
//	Thread.sleep(2000);
	 /*	//window handling
	String parentHandle = d.getWindowHandle(); 
	 System.out.println(parentHandle);
	 d.findElement(By.xpath("//a[text()='COMMERCIAL                            ']")).click();
	 Set<String> allWindowHandles = d. getWindowHandles();
	// System.out.println(allWindowHandles);
	 Thread.sleep(4000); 
	 for(String str:allWindowHandles) {
		System.out.println(str);
	if(!str.equals(parentHandle)) {
		d.switchTo().window(str);
		//d.findElement(By.linkText("/find-dealer")).click();	
		 d.findElement(By.xpath("//a[text()='Find a Dealer']")).click();
	}
	}
	
	

				
	 /*	String parentHandle = d.getWindowHandle(); 
	System.out.println("parent window -" +parentHandle);
		 d.findElement(By.xpath("//*[@id='4-firstLevel']/a")).click();		
		 Set<String> childHandle = d.getWindowHandles(); 
		Thread.sleep(4000); 
		for(String parentHandle1: childHandle){
		 System.out.println(parentHandle1);
		 if(!parentHandle1.equals(parentHandle))
		 { d.switchTo().window(parentHandle1); 
		d.findElement(By.xpath("//*[@id='top']/div[2]/ul/li[5]/a")).click();
	 } 
		} */
//		   Thread.sleep(2000);
//		WebElement dropdown= d.findElement(By.xpath("//select[@id='ddlState']"));
//		Thread.sleep(2000);
//		Select sel=new Select(dropdown);
//		Thread.sleep(2000);
//		sel.selectByVisibleText("KARNATAKA");
//		Thread.sleep(2000);
//        d.findElement(By.xpath("//*[@id='ddlCity']/option[3]")).click();
//        Thread.sleep(2000);
//        d.findElement(By.xpath("//*[@id='btnSearch']")).click();
//        Thread.sleep(2000);
	//d.quit();
	}
	}
