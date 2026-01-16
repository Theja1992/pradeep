import org.openqa.selenium.Point;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class ChromeDemo {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:/Pradeep/Java/chromedriver_win32/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.navigate().to("https://www.amazon.com/");
	driver.manage().window().maximize();
	Dimension c=driver.manage().window().getSize();
	System.out.println(c);
	System.out.println("Dimension = " + c);
	int height=c.getHeight();
	int width=c.getWidth();
	System.out.println("Height = " + height);
	System.out.println("Width = " + width);
	Point p=driver.manage().window().getPosition();
	System.out.println("Position = " + p);
	int x=p.getX();
	int y=p.getY();
	System.out.println("X = " + x);
	System.out.println("Y = " + y);
	Point sp=new Point(10,10);
	driver.manage().window().setPosition(sp);
	Dimension d=new Dimension(400,400);
	System.out.println("Dimension = " + d);
	driver.manage().window().setSize(d);
	Set<Cookie> s=driver.manage().getCookies();
	//driver.manage().deleteAllCookies();
	System.out.println(s);
	String tt=driver.getTitle();
	System.out.println(tt);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String psr=driver.getPageSource();
	System.out.println(psr);
	Thread.sleep(5000);
    driver.close();
    
    
	}

}
