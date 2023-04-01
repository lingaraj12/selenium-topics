package realApps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class EdurekaUploadTest {
 
public static void main(String[] args) throws InterruptedException {
 
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.edureka.co/");
//driver.findElement(By.linkText("Log In")).click();

driver.findElement(By.linkText("Log In")).click();
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
driver.findElement(By.id("si_popup_email")).click();
Thread.sleep(1000);
driver.findElement(By.id("si_popup_email")).sendKeys("username");
Thread.sleep(1000);
driver.findElement(By.id("si_popup_passwd")).sendKeys("password");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[3]/form/button")).click();
 
Thread.sleep(2000);
driver.get("https://learning.edureka.co/onboarding/personaldetails");
Thread.sleep(1000);
 
WebElement imageEdit = driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div[2]/a/i"));
 
imageEdit.click();
Thread.sleep(1000);
WebElement chooseFile = driver.findElement(By.id("custom-input"));
chooseFile.sendKeys("/Users/ankita/Downloads/edureka.png");
Thread.sleep(1000);
driver.findElement(By.cssSelector("div[class='submitbtnsec'] > button[type='submit']")).click();
 
}
 
}