package yaduclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Broswer {
	
	public static WebDriver driver;
	//public static String filePath ="./Data/DataPRO.xlsx";
    //public static String sheetName;
    //public static String worksheet;
    //public static String Sheet;
  
	
	public void launchAPP()
    {
		//System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver(chromeOptions);
     
	//driver = new ChromeDriver();
	
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	//driver.quit();
	
	}

}
