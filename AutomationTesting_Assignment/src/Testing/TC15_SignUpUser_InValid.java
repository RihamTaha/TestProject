package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC15_SignUpUser_InValid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/register");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);

		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("\\");
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Khaled");
		
		
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("01101201596");
		
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("Khaled_9636@gmail.com");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Cooker");
		
		
		driver.findElement(By.name("confirmpassword")).clear();
		driver.findElement(By.name("confirmpassword")).sendKeys("Cooker");
		
		
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).click();

		
		
	}

}
