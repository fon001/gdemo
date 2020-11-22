package seconddemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NF\\devopsproject\\selenium\\drivers\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.co.uk/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("men wallets");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.quit();

	}

}
