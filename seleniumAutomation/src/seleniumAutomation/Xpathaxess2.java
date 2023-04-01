package seleniumAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathaxess2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str="//div[@class='Vertebrate']/following-sibling::div";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("C:/Users/user/Desktop/selenium/sample2.html");
	String str1=d.findElement(By.xpath(str)).getAttribute("class");
		Thread.sleep(2000);

		if(str1.equals("Invertebrate"))
		{
			System.out.println("yes it is");
		}
		else
		{
			System.out.println("no it is");
		}
	}

}//for child insect and crt(//div[@class='Invertebrate']/child::div)[2]
//for lion //div[@class='Vertebrate']/child::div[2]/div[2]/div[1]