import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun {

	public static void main(String[] args)
	{
	 System.setProperty("webdriver.chrome.driver", "C:/Pradeep/Java/chromedriver_win32/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com");
	 WebElement drp=driver.findElement(By.xpath("//input[@id='input']"));
	 drp.sendKeys("Java");
	 drp.clear();
	 drp.sendKeys("Python");

	
	}

}
