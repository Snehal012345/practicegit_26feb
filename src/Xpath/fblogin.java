
package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		System.out.println("To get title----");
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println("To get Current URL----");
		
		String URL= driver.getCurrentUrl();
		System.out.println(URL);
		String exptitle="Facebook – log in or sin up";
		if(title.equalsIgnoreCase(exptitle))
		{
			System.out.println("Navigate to current webpage");
		}
		else
		{
			System.out.println("Navigate to wrong Web Page");
		}
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("bhoyarsnehal01@gmai.com");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("AGATHAODDLY123");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
		
		Thread.sleep(2000);
		
		
		
		
		
		driver.quit();
		

		
		
		
		
	}
	
	
	
	

}
