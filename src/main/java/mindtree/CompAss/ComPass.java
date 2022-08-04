package mindtree.CompAss;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ComPass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Khalid\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		
		//1. to click on the popup
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		//2.Hovering
		Thread.sleep(4000L);
		WebElement ele=driver.findElement(By.xpath("//a[@href='/en-us/our-commitment']"));
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();
		
		//.click on No.1detergent link
		driver.findElement(By.xpath("//a[@href='/en-us/our-commitment/americas-number-one-detergent']")).click();
		
		//.click on the register button 
		Thread.sleep(4000L);
		driver.findElement(By.xpath("//a[@href='/en-us/sign-in']")).click();
		
		//.Click on Signup button
		driver.findElement(By.cssSelector("a[href*='/signup/tide-coupons/']")).click();
		System.out.println(driver.findElement(By.cssSelector("a[href*='/signup/tide-coupons/']")).getText());
		System.out.println(driver.getTitle());
		
		
		//Windows switching
		Set <String> ids=driver.getWindowHandles();
		Iterator <String> it=ids.iterator();
		String Pid= it.next();
		String Cid=it.next();
		driver.switchTo().window(Cid);
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Kh12lid");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ansh001@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Khalid@123");
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
		driver.switchTo().window(Pid);
		System.out.println(driver.getTitle());
		
	}

}
