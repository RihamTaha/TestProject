package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC16_Login_Valid {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);

		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Khaled_9636@gmail.com");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Cookers");
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();

	}

}
