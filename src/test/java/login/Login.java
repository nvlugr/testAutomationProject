package login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// Open URL

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Login 
		
		WebElement txt = driver.findElement(By.name("email"));
		txt.sendKeys("sijeya6686@htoal.com");
		
		driver.findElement(By.name("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(5000);
		
		//Check the if the page correct
		
		String text="";	
		String act_txt = "> My account";
		
		try 
		{
			text = driver.findElement(By.xpath("//div[@class='breadcrumb clearfix']")).getText();
		}
		catch(NoSuchElementException e) 
		{
			
		};
		
		
		if(text.equals(act_txt)) {
			System.out.println("Correct Page!");
		}else {
			System.out.println("Failed!");
		}
		
		
		// Close the browser

				driver.quit();
	}

}
