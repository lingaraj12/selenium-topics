package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/user/Desktop/selenium/Multiselect.html");
	WebElement dropdown=d.findElement(By.xpath("//select[@id='multiple-select']"));
	Thread.sleep(2000);
	Select sel=new Select(dropdown);
  System.out.println(sel.isMultiple());
  sel.isMultiple();

  //sel.selectByVisibleText("Books");
//	sel.selectByVisibleText("Movies, Music & Games");
	//if we want select all options
	/*List<WebElement>list=sel.getOptions();
	System.out.println(list.size());
	for(int i=0; i<list.size(); i++)
	{
		sel.selectByIndex(i);*/
	Thread.sleep(2000);
	}
	}


