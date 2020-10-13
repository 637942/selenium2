import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create driver object for chrome browser
		// we wiil strictly implement methods of webdriver
		//
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karpagam Karthick\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
