package assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bluestone {
	static  {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\kvani\\Desktop\\workspaceA3\\Newprojectjenkin\\driver\\chromedriver.exe");
		   }		
	@Test
	public void bluestone() throws Exception {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com");
	
	driver.switchTo().frame("livechat-compact-view");
	driver.findElement(By.id("open-label")).click();
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame("livechat-full-view");
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pallavi");
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pallavismmh8@gmail.com");
    driver.findElement(By.xpath("//input[@id='container_4_4']")).sendKeys("9743689574");
    driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
    
    WebElement msg = driver.findElement(By.name("files"));
    msg.click();
    msg.sendKeys("Hello");

		        
	}}
