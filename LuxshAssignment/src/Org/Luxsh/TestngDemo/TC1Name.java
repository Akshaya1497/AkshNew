package Org.Luxsh.TestngDemo;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class TC1Name {
		WebDriver driver;
		@BeforeClass
		public void beforeC() {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");			
			Reporter.log("Before Class", true);
		}

		@BeforeMethod
		public void beforeM() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");	
		Reporter.log("Before Method", true);
	   }
		
		@Test
		public void TC1() throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Akshaya");
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jain");
			driver.findElement(By.xpath("//label[contains(.,'Female')]")).click();
			driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9822385578");
			Thread.sleep(1000);			
			WebElement ele = driver.findElement(By.xpath("//button[@id='submit']"));	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", ele);
			ele.click();
			Reporter.log("TC1", true);
		}

		@Test
		public void TC2() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("12345644");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jain");
		driver.findElement(By.xpath("//label[contains(.,'Female')]")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9822385578");
		Thread.sleep(1000);			
		WebElement ele = driver.findElement(By.xpath("//button[@id='submit']"));	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
		Reporter.log("TC2", true);
		}
        
		@Test
		public void TC3() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("#^%$#^$%#&$");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jain");
		driver.findElement(By.xpath("//label[contains(.,'Female')]")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9822385578");
		Thread.sleep(1000);			
		WebElement ele = driver.findElement(By.xpath("//button[@id='submit']"));	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
		Reporter.log("TC3", true);
		}
		
		@Test
		public void TC4() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("#^%$1234");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jain");
		driver.findElement(By.xpath("//label[contains(.,'Female')]")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9822385578");
		Thread.sleep(1000);			
		WebElement ele = driver.findElement(By.xpath("//button[@id='submit']"));	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
		Reporter.log("TC4", true);
		}
		
		@Test
		public void TC5() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jain");
		driver.findElement(By.xpath("//label[contains(.,'Female')]")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9822385578");
		Thread.sleep(1000);			
		WebElement ele = driver.findElement(By.xpath("//button[@id='submit']"));	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
		Reporter.log("TC5", true);
		}
		
		@AfterMethod
		public void afterM() {
			driver.close();	
			Reporter.log("After Method", true);
		}
}

