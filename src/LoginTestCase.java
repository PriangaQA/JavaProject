import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Launch chrome browser and open Simplilearn website
		//2. Maximize the browser
		//3. Click on the Login at the top right corner
		//4. Enter the user name
		//5. Enter the Password
		//6. Click on the Login button
		//7. Validate the Login is successfull
		
		
		
		//Step 1
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.simplilearn.com");
		
		//Step2
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		
		// Step3
		
		WebElement Loginlink= driver.findElement(By.linkText("Log in"));
		String location=Loginlink.getAttribute("href");
		System.out.println("The link will take u to:" +location);
		System.out.println("The title of the page is"+driver.getTitle());
		Loginlink.click();
		
		//Step4 and 5
		
		WebElement username=driver.findElement(By.name("user_login"));
		username.sendKeys("rec@gmail.com");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("Aaaaa@g$3");
		
		//Step6: click remember me chkbox
		
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		
		//Step7
		
		WebElement Loginnew=driver.findElement(By.name("btn_login"));
		Loginnew.click();
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		//Step 8
		
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		String expErrorMsg = "The email or password you have entered is invalid.";
		
		if(error.isDisplayed() && errorMsg.equals(expErrorMsg)) {
			
			System.out.println("TC Passed");
		}else {
			
			System.out.println("TC Failed");
		}
		
		
		//Step9: Link
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links:" +alllinks.size());
		
		for(WebElement Link: alllinks)
			
		{
			System.out.println(Link.getAttribute("href"));
		}
		
		//Step 9: close the driver
		
		driver.close();
		
		

		
		
		
		
		

	}

}
