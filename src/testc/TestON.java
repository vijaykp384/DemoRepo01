package testc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestON
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\works\\sourcefiles\\Chromeds_v97.0.4692.71\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String s=driver.getCurrentUrl();
		System.out.println(s);
	}

}
