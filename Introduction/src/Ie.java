import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.edge.driver","C:\\Users\\Karpagam Karthick\\Microsoft Web Driver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());

	}

}
