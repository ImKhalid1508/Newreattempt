package mindtree.CompAss;

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
		
		

	}

}
