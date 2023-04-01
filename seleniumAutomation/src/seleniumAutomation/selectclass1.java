package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class selectclass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in");
	Thread.sleep(4000);
	//d.findElement(By.xpath("//input[@name='sprefix']"));
WebElement dropdown= d.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Thread.sleep(2000);
	Select sel=new Select(dropdown);
Thread.sleep(4000);
sel.selectByVisibleText("Beauty");
//List<WebElement>list=sel.getOptions();

//for(int i=0; i<list.size(); i++)
//{
	//WebElement el=list.get(i);
	//System.out.println(el.getAttribute("Books"));
//	System.out.println(el.getText());
//}
	
	
	
	}

}
