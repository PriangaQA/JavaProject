import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFBPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		/*WebElement CreateNewButton=driver.findElement(By.linkText("Create new account"));
		CreateNewButton.click()*/;
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("xyz@gmail.com");
		WebElement Password= driver.findElement(By.name("pass"));
		Password.sendKeys("Pwdddd");
		WebElement Login =driver.findElement(By.name("login"));
		Login.click();

	}

}
