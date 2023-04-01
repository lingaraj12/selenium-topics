package realApps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dummyApp {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver(co);
		JavascriptExecutor js = (JavascriptExecutor) d;
		d.get("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		//  d.findElement(By.xpath("//a[text()='Forgot Password']")).click();
		//js.executeScript("document.getElementById('email').value='lingu@123'");


		//driver.manage().window().maximize();
		//d.findElement(By.xpath("//a[text()='Dropdown']")).click();
		//file download
		//d.findElement(By.linkText("File Download")).click();
		//Thread.sleep(4000);
		//d.findElement(By.linkText("Unipolar to Multipolar.docx")).click(); 

		//drag and drop
		// driver.findElement(By.linkText("Drag and Drop")).click();
		// Thread.sleep(2000);
		// WebElement drag=driver.findElement(By.id("column-a"));	 
		// Thread.sleep(2000);
		// WebElement drop=driver.findElement(By.id("column-b"));
		//  Thread.sleep(2000);
		// Actions act =new Actions(d);
		//  Action dragAndDrop=act.clickAndHold(drag).moveToElement(drop).release(drop).build();
		//dragAndDrop.perform();

		//drag and drop
		// Actions act =new Actions(driver);
		//act.dragAndDrop(drag, drop).perform();
		//String str1=drop.getText();
		//Thread.sleep(2000);
		//if(str1.equals("Dropped"))
		//{
		//System.out.println("file is dropped");
		//}else {
		//System.out.println("failed");
		//}

		//contextMenu
		//d.findElement(By.linkText("Context Menu")).click();
		// Actions act =new Actions(d);
		// WebElement ele=d.findElement(By.id("hot-spot"));
		// act.moveToElement(ele).perform();
		//act.contextClick(ele).perform();
		//d.findElement(By.xpath("//*[@id=\"content\"]/script")).click();

		//floatingMenu// Scrolling down the page till the element is found
		//d.findElement(By.linkText("Floating Menu")).click();
		//	WebElement Element = d.findElement(By.linkText("Elemental Selenium"));
		//js.executeScript("arguments[0].scrollIntoView();", Element);
		//to scroll some defining no. of pixels
		//	js.executeScript("window.scrollBy(0,800)", "");

		// FILE UPLOADING USING SENDKEYS ....
		//driver.findElement(By.linkText("File Upload")).click();
		// WebElement browse = driver.findElement(By.id("file-upload"));
		//click on ‘Choose file’ to upload the desired file////Uploading the file using sendKeys
		// browse.sendKeys("C:\\Users\\user\\Desktop\\low kb.jpg"); 
		// System.out.println("File is Uploaded Successfully");			
		//driver.findElement(By.id("file-submit")).click();

		//dropdown		
		//driver.findElement(By.linkText("Dropdown")).click();
		//WebElement dropdown=driver.findElement(By.id("dropdown"));
		//Select sel=new Select(dropdown);
		//sel.selectByVisibleText("Option 2");

		//checkboxes		
		//d.findElement(By.xpath("//a[text()='Checkboxes']")).click();	
		//Thread.sleep(2000);
		//d.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();	
		//Thread.sleep(2000);
		//d.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();

		//windows handeling
		Thread.sleep(2000);
		//d.findElement(By.xpath("//a[text()='Multiple Windows']")).click();	
		//Set<String>window=d.getWindowHandles();
		//	for(String str:window) {
		//	String st=d.switchTo().window(str).getTitle();
		//	System.out.println(st);
		//}
		//d.findElement(By.xpath("//a[text()='Click Here']")).click();;	
		//javascript alerts
		/*d.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();		
		//d.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		d.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert=d.switchTo().alert();
	    //alert.accept();
		//alert.dismiss();
		alert.sendKeys("lokesh");
		alert.getText();*/

		//frames	
		d.findElement(By.xpath("//a[text()='Frames']")).click();
		d.findElement(By.xpath("//a[text()='iFrame']")).click();
		d.switchTo().frame("iFrame");

		//Method 1: Switch to the frame by index	
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(1);

		//Method 2: Switch to the frame by Name or ID	
		//driver.switchTo().frame("iframe1");
		//driver.switchTo().frame("id of the element");

		//Method 3: Switch to the frame by Web Element	
		//driver.switchTo().frame(WebElement);
		//How to switch back to the Main Frame	
		// driver.switchTo().parentFrame();
		// driver.switchTo().defaultContent();

		/*	Objective for this step would be finding out the index of iframe.

		for(int i=0; i<=size; i++){
			driver.switchTo().frame(i);
			int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			    driver.switchTo().defaultContent();}*/


		/*int size = driver.findElements(By.tagName("iframe")).size();
		    System.out.println("Total Frames --" + size);

			// prints the total number of frames 
			driver.switchTo().frame(0); // Switching the Outer Frame    		
		    System.out.println (driver.findElement(By.xpath("xpath of the outer element ")).getText());

			//Printing the text in outer frame
			size = driver.findElements(By.tagName("iframe")).size();
		    // prints the total number of frames inside outer frame           

		    System.out.println("Total Frames --" + size);
		    driver.switchTo().frame(0); // Switching to innerframe
		    System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());

			//Printing the text in inner frame
			driver.switchTo().defaultContent();*/

	}
