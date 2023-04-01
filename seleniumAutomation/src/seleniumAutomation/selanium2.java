package seleniumAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selanium2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in");
	    Thread.sleep(4000);
	d.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	   Thread.sleep(5000);
	d.findElement(By.id("nav-search-submit-text")).click();
	    Thread.sleep(5000);
	    //window handeling
     String parent=d.getWindowHandle();
     System.out.println(parent);
    //forward traversing
     d.findElement(By.xpath("(//a/span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();     
        Thread.sleep(4000);
	 Set<String>child=d.getWindowHandles();
	     for(String str:child) {
	    	 if(!str.equals(parent)) {
	    		 d.switchTo().window(str).getTitle();
	    		System.out.println(str);
	    		 //multiple attributes
	    		 Thread.sleep(4000);
	    		d.findElement(By.xpath("//input[@id='add-to-cart-button'][@name='submit.add-to-cart']")).click(); 
	    	
	    		 System.out.println("window handled");
	    	 } Thread.sleep(4000);
	    //backward traversing
	     d.findElement(By.xpath("(//span[@id='attach-sidesheet-checkout-button'])[1]/../form[@id='attach-view-cart-button-form']")).click();
	//prededing sibling
	    // d.findElement(By.xpath("(//span[@id='attach-sidesheet-checkout-button'])[1]/preceding-sibling::form[@id='attach-view-cart-button-form']")).click(); 
	//d.quit();
	}}}
	


