import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testaaa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Pradeep/Java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.cssSelector("body[jsmodel='hspDDf']")).sendKeys("Pradeep");
		

	}

}
