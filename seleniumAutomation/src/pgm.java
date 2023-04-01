import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pgm {
	 


	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		/*	driver.findElement(By.name("q")).sendKeys("indian standard time");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath("(//span[contains(text(), 'indian standard time')])[1]")).click();
	Thread.sleep(4000);
	String time=driver.findElement(By.xpath("//div[@class='gsrt vk_bk FzvWSb YwPhnf']")).getText();	
		String current_time="7:32";		
		//Assert.assertTrue(time.contains(current_time));
		//Reporter.log(current_time, true);
		if(time.contains(current_time)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		LocalTime local=LocalTime.now();
     System.out.println("current time :"+time);
     DateFormat df=new SimpleDateFormat("MM/dd/yyyy ");
	Date date=new Date();
	System.out.println(df.format(date));*/


		/*//script up to proceed to checkout
		driver.get("https://www.healthkart.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='MuscleBlaze Biozyme Iso-Zero,  4.4 lb  Low Carb Ice Cream Chocolate ']")).click();
		Set<String> child=driver.getWindowHandles();
		for(String str: child) {
			if(!str.equals(parent)) {
				driver.switchTo().window(str).getTitle();
				System.out.println(str);
				driver.findElement(By.xpath("//*[text()=' Add To Cart']")).click();
			}}
	driver.findElement(By.xpath("//a[@data-event='CheckoutStarted']")).click();*/
		driver.get("https://www.healthkart.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	/*//actions class
		WebElement ele=driver.findElement(By.xpath("//*[text()=' Best Sellers']"));	
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Weight Gainer")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='MuscleBlaze Weight Gainer with Added Digezyme']")).click();*/	
		
		//broken links
	List<WebElement> broken=driver.findElements(By.tagName("a"));
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
	if(respcode>=400) {
		System.out.println("link text:"+url+ " " +"Response code:"+http.getResponseMessage());
	}else {
		System.out.println("link text:"+url+" "+"Response code:"+http.getResponseCode());
	}}catch(MalformedURLException e) {
	
	}
	}}
}
	
		
		
		
		
		
		/*@Override
		public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", ele);

		}

		@Override
		public void click(WebDriver driver, WebElement ele) {

			Actions act = new Actions(driver);
			act.moveToElement(ele).click().build().perform();*/


	


