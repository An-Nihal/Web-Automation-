package gtpl_Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\Testing\\Scripts\\Guru99\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.guru99.com/V1/index.php");
		
		driver.findElement(By.name("uid")).sendKeys("mngr490272");
		driver.findElement(By.name("password")).sendKeys("uvUbaju");
		
		driver.findElement(By.name("btnLogin")).click();
		
		String valtext = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
		
		  if (valtext.contentEquals("Welcome To Manager's Page of GTPL Bank")){
	            System.out.println("Login Test Passed!");
	        } else {
	            System.out.println("Login Test Failed");
	        }
		  
		
		
	}
}
