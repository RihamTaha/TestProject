package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_SignUpUser_Bug {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/register");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);

		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("farah");
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Youssef");
		
		
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("01123456789");
		
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("farahYoussef963@gmail.com");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Runner");
		
		
		driver.findElement(By.name("confirmpassword")).clear();
		driver.findElement(By.name("confirmpassword")).sendKeys("Runner");
		
		
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).click();


	}

}
