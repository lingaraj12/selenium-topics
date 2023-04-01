package realApps;
import java.util.Set; 


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;





public class motherHood {

	public static void main(String[] args) throws InterruptedException {
		// TODO Automation of motherhood
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 ChromeOptions p = new ChromeOptions(); 
		p.addArguments("--disable-notifications"); 
		WebDriver driver = new ChromeDriver(p); 
		driver.navigate().to("https://www.motherhoodindia.com");
		 Thread.sleep(2000); 
		driver.manage().window().maximize();
		 Thread.sleep(2000); 
		 
		WebElement location=driver.findElement(By.linkText("LOCATIONS"));
		 Actions action =new Actions(driver);
		 action.moveToElement(location).click().build().perform();
		 Thread.sleep(3000);
		 WebElement bangalore=driver.findElement(By.linkText("Bangalore"));
		 action.moveToElement(bangalore).click().build().perform();
		 Thread.sleep(3000); 
		WebElement banshankari=driver.findElement(By.linkText("Banashankari"));
		 action.moveToElement(banshankari).click().build().perform();
		 Thread.sleep(3000);
	   WebElement select=driver.findElement(By.xpath("(//select[@class='form-control filter-select-doctor speciality-doctor doctor-filter-inline '])[1]")); 
		Thread.sleep(3000);
       Select sel=new Select(select);
      sel.selectByVisibleText("Radiology");
      Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"doctor_search_name\"]/input")).sendKeys("lingaraj");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[text()='View Profile'])[2]")).click();
	String experience="//*[@id=\"jupiterx-main\"]/div/div/div/section[1]/div[2]/div/div[2]/div/div/section[2]/div[2]/div/div[2]";
	String exp=driver.findElement(By.xpath(experience)).getText();
	System.out.println(exp);
	   Thread.sleep(3000);
	   String unit=" //*[@id=\"jupiterx-main\"]/div/div/div/section[1]/div[2]/div/div[2]/div/div/section[3]/div[2]/div/div[1]";
		String ut=driver.findElement(By.xpath(unit)).getText();
		System.out.println(ut);
		Thread.sleep(3000);
		String worktime="//*[@id=\"jupiterx-main\"]/div/div/div/section[1]/div[2]/div/div[2]/div/div/section[4]/div[2]/div/div[1]/div/div/div";
		String wt=driver.findElement(By.xpath(worktime)).getText();
		System.out.println(wt);	   
		Thread.sleep(3000);
	 driver.quit();  
	   
	
	
	}
	
	
	
 
	
	
	}


