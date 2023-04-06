package gtpl_bank_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import gtpl_bank_pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "F:\\Testing\\Scripts\\Guru99\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(driver);

		//TestCase_1
		
		lp.WriteUsername("mngr490248");
		lp.WritePassword("mehujEs");
		lp.ClickLogin();
		
		
		//TestCase_2
		
		
		
		
	}



	}

