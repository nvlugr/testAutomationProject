package infoLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class infoLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Open app

		driver.get("http://www.automationpractice.pl/index.php?");
		driver.manage().window().maximize();

		// Find Information links

		Integer act_links = driver.findElements(By.className("item")).size();
		Integer expct_links = 3;
		
		//Check the number of the links in the info section
		
		if (act_links.equals(expct_links)) {
			System.out.println("There are " + expct_links + " links in the Information section: AS EXPECTED");
		} else {
			System.out.println("There are" + expct_links + " links in the Information section: NOT EXPECTED");
		}
	}

}
