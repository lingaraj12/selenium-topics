package seleniumAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumXpathAcess {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
	d.get("C:/Users/user/Desktop/selenium/sample2.html");
	d.findElement(By.xpath("//div[@class='Mammal']/child::div[2]/div[2]")).click();
	Thread.sleep(2000);
	//d.findElement(By.xpath("//div[@class='Mammal']/child::div[@class='Carnivore']/child::div[2]")).click();
	//Thread.sleep(2000);
	
	}

}
