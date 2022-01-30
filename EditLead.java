package stepedit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass1{

	@Given ("Enter username as Demosalesmanager")
	public void enterusername () {
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		}
	@And ("Enter the password as crmsfa")
	public void enterpassword () {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("Click on Login button")
	public void clicklogin () {
		driver.findElement(By.className("decorativeSubmit")).click();
		}
	@When("Click on Crmsfa")
	public void createLead() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

@When("Click Leads link")
public void clickLeadsLink() {
	driver.findElement(By.linkText("Leads")).click();
}
@When("Click Find leads")
public void clickFindLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
}
@When("Enter first name")
public void enterFirstName() {
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("SIVA GURUMOORTHY");
}
@When("Click Find leads button")
public void clickFindLeadsButton() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
}
@When("Click on first resulting lead")
public void clickOnFirstResultingLead() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
}
@Then("Verify title of the page")
public void verifyTitleOfThePage() {
	System.out.println(driver.getTitle()); 
}
@When("Click Edit")
public void clickEdit() {
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
}
@Given("Change the company name")
public void changeTheCompanyName() {
	WebElement Companyname = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName'][@name='companyName']"));
	Companyname.clear();
	Companyname.sendKeys("SIEMENS");
}
@When("Click Update")
public void clickUpdate() {
	driver.findElement(By.className("smallSubmit")).click();	
}
@Then("Confirm the changed name appears")
public void confirmTheChangedNameAppears() {
	String title2 = driver.getTitle();
	System.out.println(title2);
}
}
