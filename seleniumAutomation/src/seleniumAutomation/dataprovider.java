package seleniumAutomation;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class dataprovider {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();

		if(n.equals("url"))
		{
			d.get(s);
		}
	  }
	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "url", "https://amazon.in" },
	      new Object[] { "username", "lingaraj" },
	    };
  }

 
  }

