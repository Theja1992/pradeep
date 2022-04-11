import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:/Pradeep/Java/chromedriver_win32/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.id("email")).sendKeys("pradi34theja@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("Dont open");
		 driver.findElement(By.name("login")).click();
	

	}

}
