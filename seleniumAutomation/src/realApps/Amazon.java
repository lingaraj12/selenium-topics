
package realApps;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver(co);
		d.get("https://www.amazon.in/");
		//WebElement location=d.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
		// Actions action =new Actions(d);
		// action.moveToElement(location).perform();
		// Thread.sleep(3000);
		//d.findElement(By.xpath("//*[@id=\"icp-flyout-mkt-change\"]/span/div")).click();
		// Thread.sleep(3000);
		//	d.findElement(By.xpath("//*[@id=\"icp-cancel-button\"]/span/a")).click();
		
		//handeling dropdown withput select class
		//List <WebElement> dropdown= d.findElements(By.id("searchDropdownBox"));	
		/*for(int i=0; i<dropdown.size(); i++) {
		if(dropdown.get(i).getText().contains("Apps & Games")) {
        dropdown.get(i).click();
        System.out.println("clicked");
	}
		for(WebElement el:dropdown) {
		     if(el.getText().contains("Apps & Games")) {
		       el.click();	
		       break;
		     }
		     for(int i = 0; i<=dropdown.size()-1; i++) {
	                if(dropdown.get(i).getText().contains("Apps & Games")) {
	                	dropdown.get(i).click();
	                   break;}*/

		/*	//broken links
		List<WebElement> broken=d.findElements(By.tagName("a"));
		System.out.println(broken.size());
		//for (int i=0; i<broken.size();i++) {
		for(WebElement link :broken) {
			//WebElement ele=broken.get(i);
			String url=link.getAttribute("href");
			try {
				URL ul=new URL(url);
				//URLConnection connect=ul.openConnection();
				HttpURLConnection  http=(HttpURLConnection)ul.openConnection();
				Thread.sleep(2000);
				http.connect();
				int respcode=http.getResponseCode();
				if(respcode>=600) {
					System.out.println("link text:"+ul+ " " +"Response code:"+http.getResponseMessage());
				}else {
					System.out.println("link text:"+ul+" "+"Response code:"+http.getResponseCode());
				}}catch(MalformedURLException e) {

				}
				//window handling
    String parent = d.getWindowHandle(); 
	System.out.println(parent);
	d.findElement(By.xpath("//span[text()='Xtore® Universal Mobile Phone Holder & Tablet Holder with 360° Rotation']")).click();
	 Set<String> child = d. getWindowHandles();
	 Thread.sleep(4000);
	 for(String st1:child) {
		if(!st1.equals(parent)) {
		d.switchTo().window(st1).getTitle();
	System.out.println(st1);
	d.findElement(By.id("add-to-cart-button")).click();
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//span[text()=' Cart ']")).click();	
	 Thread.sleep(2000);
	 d.findElement(By.id("proceed-to-checkout-action")).click();
		}
	 }

 	 Thread.sleep(3000);
 	   //WebElement dropdown= d.findElement(By.id("searchDropdownBox"));
 	   //Select sel=new Select(dropdown);
 	    //sel.selectByVisibleText("Books");

 		/*d.findElement(By.linkText("Mobiles")).click();
 	    Thread.sleep(3000);
 	   // d.findElement(By.xpath("//span[text()='Made for Amazon']/../div")).click();
 	    d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);*/




















		}
	}

