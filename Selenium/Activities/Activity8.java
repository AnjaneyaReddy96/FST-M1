import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Activity8 {

	public static void main(String[] args) {
		
		//Create new instance of the webdriver
				WebDriver driver = new FirefoxDriver();
				//Create the Actions object
				Actions builder = new Actions(driver);
				
				//Open the web page
				driver.get("https://training-support.net/webelements/mouse-events");
				//Print the title of the web page
				System.out.println("Title of the page: " + driver.getTitle());
				
				//to Find the elements 
				WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
				WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
				WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
				WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
				
				
				builder.click(cargoLock).pause(1000).moveToElement(cargoToml).pause(5000).click(cargoToml).build().perform();
				
				
				String actionMessage = driver.findElement(By.id("result")).getText();
				System.out.println(actionMessage);
				
				//to Perform double click on src
			
				builder.doubleClick(srcButton).pause(3000).pause(5000).contextClick(targetButton).pause(3000).build().perform();
				
				
				builder.click(driver.findElement(By.xpath("//div[@id = 'menu']/div/ul/li[1]"))).pause(5000).build().perform();
				
				//Print the front side text
				actionMessage = driver.findElement(By.id("result")).getText();
				System.out.println(actionMessage);
				
				//Close the browser
				driver.close();

	}

}
