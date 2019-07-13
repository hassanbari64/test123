package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test3 {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\chromewebdriver\\chromedriver.exe");
		   // WebDriver driver = new ChromeDriver();
//driver.manage().window().maximize();
ChromeOptions options = new ChromeOptions();
options.addArguments("start-maximized");
options.addArguments("disable-infobars");
//options.addArguments("--incognito");
//options.addArguments("--ignore-certificate-errors");
// options.addArguments("--disable-popup-blocking");
WebDriver driver = new ChromeDriver(options);

driver.get("https://qatestid12.wixsite.com/qaspecialist");

WebElement contact;
//username = driver.findElement(By.id("input-email"));
//username = driver.findElement(By.name("email"));
WebDriverWait wait2 = new WebDriverWait(driver,20);

wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"comp-ifgtula74label\"]")));

contact = driver.findElement(By.xpath("//*[@id=\"comp-ifgtula74label\"]"));

WebDriverWait wait22 = new WebDriverWait(driver,20);

wait22.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"button-payment-address\"]")));






contact.click();
System.out.println("hassan");


/*username.sendKeys("mytc5@gmail.com");
//username.clear();
//username.sendKeys("hahadsa");
WebElement pass = driver.findElement(By.id("input-password"));

pass.sendKeys("123456789");
WebElement loginButton;  
loginButton = driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-primary']"));

loginButton.click();
String actualpagetitle = "";
String expectedTitle = "My Account";
actualpagetitle  = driver.getTitle();

System.out.println(actualpagetitle);

if (actualpagetitle.contentEquals(expectedTitle)){
    System.out.println("Test Passed!");
} else {
    System.out.println("Test Failed");
}
String url = "";
url = driver.getCurrentUrl();
System.out.println(url);

if (actualpagetitle.contains("Orders")){
    System.out.println("URL Test Passed!");
} else {
    System.out.println("Hassan Test fail");
}

driver.quit();
*/

			}

}
