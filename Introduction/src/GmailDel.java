import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


	

public class GmailDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karpagam Karthick\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//*[@id='mv-tiles']/div[2]/a")).click();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("sudha.karpagamv@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("30608214024");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=':2a']/div[1]/div")).click();
		Select s = new Select(driver.findElement(By.xpath("//*[@id=':2a']/div[1]/div")));
		s.selectByVisibleText("Unread");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=':j6']/div")).click();
	}

}
