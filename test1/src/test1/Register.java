package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Register {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromewebdriver\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 options.addArguments("disable-infobars");
		 //options.addArguments("--incognito");
		 //options.addArguments("--ignore-certificate-errors");
		 //options.addArguments("--disable-popup-blocking");
		 WebDriver driver = new ChromeDriver(options);
		 driver.get("https://demo.opencart.com");
		 driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	      try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	        
	      driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	      
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			WebElement firstname;
			   firstname = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
			firstname.sendKeys("hassan");

					
					WebElement lastname;
					lastname =driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
					lastname.sendKeys("bari");
			
					WebElement email;
					email=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
					email.sendKeys("hassan.bari@next79977geni.com");
					
					WebElement telephone;
					telephone=driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
					telephone.sendKeys("03312269542");
					
					WebElement password1;
					password1=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
					password1.sendKeys("hassan1");
					
					WebElement cpassword1;
					cpassword1=driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
					cpassword1.sendKeys("hassan1");
					

			        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]")).click();
			        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
			        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();

					
					 driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
					  try {
							Thread.sleep(3000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					        
					 
					  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
					      
							
		 
		

		 




	}

}
