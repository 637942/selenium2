import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karpagam Karthick\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.id("firstName")).sendKeys("Yogith");
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Karthick");
		driver.findElement(By.cssSelector("*[id='username']")).sendKeys("Yogithkar2003");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("Yogith@kar20");
		driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("Yogith@kar20");
		driver.findElement(By.cssSelector("content.CwaK9")).click();
		

	}

}
