import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class parallTest {
@Test
public void chromeTest() {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.in/");

}
@Test
public void ieDriver() {
	WebDriver driver=new InternetExplorerDriver();
driver.get("http://www.google.in/");
}


}
