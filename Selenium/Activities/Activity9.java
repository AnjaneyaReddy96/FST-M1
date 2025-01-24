import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//Create the Actions object
		Actions builder = new Actions(driver);
		
		//Open the web page
		driver.get("https://training-support.net/webelements/keyboard-events");
		//Print the title of the page
		System.out.println("Title of the page: " + driver.getTitle());
		
		//Press the key
		builder.sendKeys("Selenium - Full Stack Testing").sendKeys(Keys.RETURN).build().perform();
		
		//Print the message from the page 
		String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
		System.out.println(pageText);
		
		//Close the browser
		driver.quit();

	}

}
