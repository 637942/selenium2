import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubWebdriver.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karpagam Karthick\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.uk");
		Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav-link-yourAccount\']/span[2]"))).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

	}

}
