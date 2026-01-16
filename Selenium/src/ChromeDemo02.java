

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo02 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:/Pradeep/Java/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
    driver.navigate().to("https://www.amazon.com/");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	Dimension d=driver.manage().window().getSize();
	System.out.println(d);
	int height=d.getHeight();
	int width=d.getWidth();
	System.out.println("Height = " + height);
	System.out.println("Width = " + width);
	Dimension d1=new Dimension(500,484);
	driver.manage().window().setSize(d1);
	Point p=driver.manage().window().getPosition();
	int x=p.getX();
	int y=p.getY();
	System.out.println("X Axis" + x);
	System.out.println("Y Axis = " + y);
	Point sp=new Point(10,12);
	driver.manage().window().setPosition(sp);
	Set<Cookie> ab=driver.manage().getCookies();
    Thread.sleep(5000);
    driver.close();
   
	}

}
