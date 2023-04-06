package demoqa_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTable_Pages {

	WebDriver driver;

	public WebTable_Pages(WebDriver driver) {
		this.driver = driver;
	}
	
	By AddRecord = By.id("addNewRecordButton");
	By FirstName = By.id("firstName");
	By LastName = By.id("lastName");
	By Email = By.id("userEmail");
	By Age = By.id("age");
	By Salary = By.id("salary");
	By Department = By.id("department");
	By Submit = By.id("submit");
	By EditFirstRecord = By.id("edit-record-1");
	By EditSecondRecord = By.id("edit-record-2");
	By EditThirdRecord = By.id("edit-record-3");
	By DeleteFirstRecord = By.id("delete-record-1");
	By DeleteSecondRecord = By.id("delete-record-2");
	By DeleteThirdRecord = By.id("delete-record-3");
	
	
	public void AddNewRecord() {
		driver.findElement(AddRecord).click();
	}
	
	
	public void WriteFirstname(String firstname) {
		driver.findElement(FirstName).clear();
		driver.findElement(FirstName).sendKeys(firstname);
	}
	
	public void WriteLastname(String lastname) {
		driver.findElement(LastName).clear();
		driver.findElement(LastName).sendKeys(lastname);
	}
	
	public void WriteEmail(String email) {
		driver.findElement(Email).clear();
		driver.findElement(Email).sendKeys(email);
	}
	
	public void WriteAge(String age) {
		driver.findElement(Age).clear();
		driver.findElement(Age).sendKeys(age);
	}
	
	public void WriteSalary(String salary) {
		driver.findElement(Salary).clear();
		driver.findElement(Salary).sendKeys(salary);
	}
	
	public void WriteDepartment(String department) {
		driver.findElement(Department).clear();
		driver.findElement(Department).sendKeys(department);
	}
	
	public void Submit() {
		driver.findElement(Submit).click();
	}
	
	public void EditFirstRecord() {
		driver.findElement(EditFirstRecord).click();
	}
	
	public void EditSecondRecord() {
		driver.findElement(EditSecondRecord).click();
	}
	
	public void EditThirdRecord() {
		driver.findElement(EditThirdRecord).click();
	}
	
	public void DeleteFirstRecord() {
		driver.findElement(DeleteFirstRecord).click();
	}
	public void DeleteSecondRecord() {
		driver.findElement(DeleteSecondRecord).click();
	}
	
	public void DeleteThirdRecord() {
		driver.findElement(DeleteThirdRecord).click();
	}
	
	
	
	
}
