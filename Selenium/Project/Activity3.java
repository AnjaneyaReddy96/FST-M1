package Project;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity3 {
	
	WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
    }

    @Test
    public void method() throws InterruptedException {
        WebElement username_field = driver.findElement(By.xpath("//input[contains(@name,'Username')]"));
        WebElement password_field = driver.findElement(By.xpath("//input[contains(@name,'Password')]"));
        WebElement login_button = driver.findElement(By.xpath("//input[@name='Submit']"));
        
        username_field.sendKeys("orange");
        password_field.sendKeys("orangepassword123");
        login_button.click();
        Thread.sleep(6);
        
        String homepage_welcome_text = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
        Assert.assertEquals(homepage_welcome_text, "Welcome Aj");
        System.out.println("The home page has opened");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
