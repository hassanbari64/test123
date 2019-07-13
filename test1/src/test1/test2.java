package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test2 {

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

driver.get("https://demo.opencart.com/index.php?route=account/login");

WebElement username;
//username = driver.findElement(By.id("input-email"));
//username = driver.findElement(By.name("email"));
username = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));


username.sendKeys("mytc5@gmail.com");
//username.clear();
//username.sendKeys("hahadsa");
WebElement pass = driver.findElement(By.id("input-password"));

pass.sendKeys("123456789");
WebElement loginButton;  
loginButton = driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-primary']"));

loginButton.click();
WebElement search = driver.findElement(By.name("search"));
search.sendKeys("HP LP3065");
WebElement button = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
button.click();
WebElement openfilter  = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("arguments[0].scrollIntoView()", openfilter);

openfilter.click();
WebDriverWait wait2 = new WebDriverWait(driver,20);

wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"button-cart\"]")));
WebElement op2  = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
JavascriptExecutor jse2 = (JavascriptExecutor)driver;
jse2.executeScript("arguments[0].scrollIntoView()", op2);
op2.click();

WebElement done  = driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
done.click();
driver.findElement(By.linkText("Checkout")).click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement done22  = driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]"));
done22.click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]")).click();

/*

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

*/


			}

}
