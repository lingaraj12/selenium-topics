package realApps;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		 ChromeOptions p = new ChromeOptions(); 
			p.addArguments("--disable-notifications"); 
		WebDriver d=new ChromeDriver(); 
		d.navigate().to("https://courses.letskodeit.com/practice"); 
		Thread.sleep(2000); 
		//d.manage().window().maximize(); 
		
		Thread.sleep(2000); 
		/* multiselect
		WebElement dropdown=d.findElement(By.id("multiple-select-example"));
		Select sel=new Select(dropdown);
		List<WebElement>size=sel.getOptions();
		for(int i=0;i<size.size();i++) {
			sel.selectByIndex(i);
		}*/
		d.findElement(By.id("name")).sendKeys("Hii");
		d.findElement(By.id("alertbtn")).click();
	Alert alert=d.switchTo().alert();
	alert.accept();
	//alert.dismiss();
	//alert.getText();
	//alert.sendKeys("Hii");
	}
	
}
