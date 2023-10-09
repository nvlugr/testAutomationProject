package infoLinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class infoLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Open app

		driver.get("http://www.automationpractice.pl/index.php?");
		driver.manage().window().maximize();
		

	}

}
