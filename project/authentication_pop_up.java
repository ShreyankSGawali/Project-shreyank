package pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authentication_pop_2 
{
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();

				
				//to handle authentication pop we have to follow simple method
				
				//in authentication we have to provide id and password
				// so id=selenium pass=webdriver   
				
				// so have to use
				// https://id:pass@chercher.tech/auth/
				//https://selenium:webdriver@chercher.tech/auth/
			
				driver.get("https://selenium:webdriver@chercher.tech/auth/");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				Alert alt=driver.switchTo().alert();
				Thread.sleep(2000);
				
				alt.accept();
				
				//then we switch to alert pop and
				
				
				
				
}

}
