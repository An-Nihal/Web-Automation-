package demoqa_test;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import demoqa_pages.WebTable_Pages;

public class WebTable_Test {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		WebTable_Pages wp = new WebTable_Pages(driver);
		
		//Test_Case#1 (Adding New Record)
		
		wp.AddNewRecord();
		wp.WriteFirstname("John");
		wp.WriteLastname("Wick");
		wp.WriteEmail("johnwick@continental.com");
		wp.WriteAge("40");
		wp.WriteSalary("10000000");
		wp.WriteDepartment("Assasins");
		wp.Submit();
		
		//Test_Case#2 (Editing Existing Record)
		
		wp.EditFirstRecord();
		wp.WriteFirstname("Son");
		wp.WriteLastname("Goku");
		wp.WriteEmail("goku@dbz.com");
		wp.WriteAge("35");
		wp.WriteSalary("555555");
		wp.WriteDepartment("Martial Artist");
		wp.Submit();
		
		wp.EditThirdRecord();
		wp.WriteFirstname("Jason");
		wp.WriteLastname("Bourne");
		wp.WriteEmail("jason@imd.com");
		wp.WriteAge("35");
		wp.WriteSalary("69");
		wp.WriteDepartment("Agent");
		wp.Submit();
		
		
		//Test_Case#3 (Deleting Existing Record)
		
		wp.DeleteSecondRecord();

	}

}
