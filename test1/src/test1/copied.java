package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class copied {

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\chromewebdriver\\chromedriver.exe");

ChromeOptions options = new ChromeOptions();
options.addArguments("start-maximized");
options.addArguments("disable-infobars");
//options.addArguments("--incognito");
//options.addArguments("--ignore-certificate-errors");
//options.addArguments("--disable-popup-blocking");
WebDriver driver = new ChromeDriver(options);



//WebDriver driver1 = new ChromeDriver();

// driver.manage().window().maximize();

driver.get("https://demo.opencart.com/index.php?route=account/login");

WebElement username;
username = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
username.clear();
username.sendKeys("mytc5@gmail.com");


//driver.findElement(By.id("input-email")).sendKeys("mytc5@gmail.com");

WebElement password;
password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
password.sendKeys("123456789");



WebElement loginButton; 
loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
loginButton.click();

//Asserts titles for checkpoint
String actualpagetitle = "";
String expectedTitle = "My Account";
actualpagetitle = driver.getTitle();

System.out.println(actualpagetitle);

if (actualpagetitle.contentEquals(expectedTitle)){
System.out.println("Test Passed!");
} else {
System.out.println("Test Failed");
}

String url = "";
url = driver.getCurrentUrl();
System.out.println(url);

if (actualpagetitle.contains("Account")){
System.out.println("URL Test Passed!");
} else {
System.out.println("URL Test Failed");
}


Thread.sleep(3000);



driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("HP LP3065");
driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

String url1 = "";
url1 = driver.getCurrentUrl();
System.out.println(url1);

if (actualpagetitle.contains("")){
System.out.println("HP LP3065 Test Passed!");
} else {
System.out.println("HP LP3065 Test Failed");
}
Thread.sleep(3000);

driver.findElement(By.xpath(" //*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]")).click();
Thread.sleep(3000);

driver.findElement(By.xpath(" //*[@id=\"input-option225\"]")).clear();
driver.findElement(By.xpath(" //*[@id=\"input-option225\"]")).sendKeys("2019-07-13");
driver.findElement(By.xpath("//*[@id=\"product\"]/div[1]/div/span/button/i")).click();
driver.findElement(By.xpath(" //*[@id=\"input-quantity\"]")).sendKeys("2");
driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();
Thread.sleep(3000);
driver.findElement(By.xpath(" //*[@id=\"button-payment-address\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath(" //*[@id=\"button-shipping-address\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath(" //*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")).sendKeys("Done");
driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]")).click();
Thread.sleep(3000);

driver.findElement(By.xpath(" //*[@id=\"collapse-payment-method\"]/div/p[3]/textarea")).sendKeys("Done");
driver.findElement(By.xpath(" //*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")).click();
driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"button-confirm\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();

Thread.sleep(3000);


driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();

Thread.sleep(5000);







driver.close();
driver.quit();



}

}
