import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Bookingflow {
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karpagam Karthick\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			//driver.findElement(By.xpath("//*[@id='mv-tiles']/div[2]/a")).click();
			driver.get("https://d2mor:d2mor@stage.moorings.co.uk/");
			Actions a =new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\'mega-menu-link-27721\']")).click();
			//a.moveToElement(e);
			driver.findElement(By.xpath("//*[@id=\'main\']/section/div[3]/div/div/div[3]/div[1]/div/div[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\'main\']/section/div[3]/div/div/div[3]/div[2]/div/div[3]/a")).click();
			                             //*[@id="main"]/section/div[3]/div/div/div[3]/div[2]/div/div[3]/a
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\'moorings-holiduct-side\']/div/div[4]/a[1]")).click();
			
			//e1.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//e1.click();
			
			//a.doubleClick(e1).perform();
			
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/div[1]/div/div/div/div/div[1]/label/input")).click();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/button")).click();
			Select s = new Select(driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/select[1]")));
			s.selectByValue("MRS");
	
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='booking-flow']/div/div[3]/div/form/input[1]")).sendKeys("Test");
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/input[2]")).sendKeys("Test");
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/span/input[1]")).sendKeys("01");
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/span/input[2]")).sendKeys("01");
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/span/input[3]")).sendKeys("1990");
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/input[3]")).sendKeys("karpskarthi20@gmail.com");
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/input[4]")).sendKeys("07881231223");
			Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/select[2]")));
			s1.selectByValue("GB");
	
			driver.findElement(By.xpath("//*[@id='booking-flow']/div/div[3]/div/form/div[2]/input[1]")).sendKeys("Test");
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/div[2]/input[3]")).sendKeys("Test");
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/div[2]/input[4]")).sendKeys("Test");
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/div[2]/input[5]")).sendKeys("Test");
			driver.findElement(By.xpath("//*[@id=\'terms\']")).click();
			driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/div[4]/button")).click();
			//driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/form/div[4]/button")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	      //  WebElement iFrame = driver.findElement(By.xpath("//*[@id=\'booking-flow\']/div/div[3]/div/iframe"));
			 WebElement iFrame = driver.findElement(By.tagName("iframe"));
	         driver.switchTo().frame(iFrame);
	         System.out.println("went inside iframe");
	         Thread.sleep(300);	
	       // WebElement card = driver.findElement(By.xpath("//*[@id=\'card_number\']"));
	         WebElement card =driver.findElement(By.id("card_number"));
	        card.sendKeys("4444333322221111");	
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        WebElement month = driver.findElement(By.xpath("//*[@id=\'exp_month\']"));
			Select s2 = new Select(month);
			s2.selectByValue("06");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement year = driver.findElement(By.xpath("//*[@id=\'payment-form\']/div[2]/select[2]"));
			Select s3 = new Select(year);
			s3.selectByValue("2027");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement cvv = driver.findElement(By.xpath("//*[@id=\'cv2_number\']"));
			cvv.sendKeys("444");
			WebElement btn = driver.findElement(By.xpath("//*[@id=\'continue\']"));
			btn.click();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@id=':2a']/div[1]/div")).click();
			//Select s = new Select(driver.findElement(By.xpath("//*[@id=':2a']/div[1]/div")));
			//s.selectByVisibleText("Unread");
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@id=':j6']/div")).click();
		}

	}

