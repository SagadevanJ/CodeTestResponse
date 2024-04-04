package baseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonMethods {
	public static Properties prop;
	
	public static WebDriver driver;
	public CommonMethods () {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(".//src//main//java//configFile//config.properties");
			prop.load(ip);
		}
			catch(Exception e) {
	
				System.out.println(e);

			}
		}

		public static void initialization () {

			String browsername = prop.getProperty("Browser");
			if (browsername.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\TashNila\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();			
			}

			else if (browsername.equals("ie")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\TashNila\\Desktop\\Automation\\chromedriver-win64\\IEDriverServer.exe");
				driver = new EdgeDriver();			

			}

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("AppUrl"));

			
			
		}}
