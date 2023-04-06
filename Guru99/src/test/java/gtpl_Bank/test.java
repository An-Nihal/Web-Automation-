package gtpl_Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "F:\\Testing\\Scripts\\Guru99\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr490272");
		driver.findElement(By.name("password")).sendKeys("uvUbaju");
		
		driver.findElement(By.name("btnLogin")).click();
		
		String valtext = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
		
		if (valtext.contentEquals("Welcome To Manager's Page of GTPL Bank"))
		{
			System.out.println("Login Test Passed!");
		}
		else
		{
			System.out.println("Login Test Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
//		driver.findElement(By.name("name")).sendKeys("Md. Golam An Nihal");
//		driver.findElement(By.name("rad1")).click();
//		driver.findElement(By.name("addr")).sendKeys("273, North Pirerbagh, Mirpur, Dhaka, Bangladesh");
//		driver.findElement(By.name("city")).sendKeys("Dhaka");
//		driver.findElement(By.name("state")).sendKeys("Dhaka");
//		driver.findElement(By.name("pinno")).sendKeys("1234");
//		driver.findElement(By.name("pinno")).sendKeys("1234");
		
		
		
		
	}

}
