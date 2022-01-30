package stepduplicate;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLead extends BaseClass3{
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
@When("Click on Email")
public void clickOnEmail() throws InterruptedException {
	Thread.sleep(500);
	driver.findElement(By.xpath("//span[text()='Email']")).click();
}
@Given("Enter Email")
public void enterEmail() {
	driver.findElement(By.xpath("//input[@name='emailAddress'][@type='text']")).sendKeys("gurusmart123@gmail.com");
}
@When("Click find leads button")
public void clickFindLeadsButton() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
}
@Then("Capture name of First Resulting lead")
public void captureNameOfFirstResultingLead() throws InterruptedException {
    Thread.sleep(5000);
String CaptureFirstElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
	System.out.println(CaptureFirstElement);
}
@When("Click First Resulting lead")
public void clickFirstResultingLead() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
}
@When("Click Duplicate Lead")
public void clickDuplicateLead() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
}
@Then("Verify the title as Duplicate Lead")
public void verifyTheTitleAsDuplicateLead() {
	System.out.println(driver.getTitle());
}
@When("Click Create Lead")
public void clickCreateLead() {
	driver.findElement(By.xpath("//input[@class='smallSubmit'][@value='Create Lead']")).click();
}
@Then("Duplictae Lead will be displayed")
public void duplictaeLeadWillBeDisplayed() {
	String DuplicateTitle = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
	System.out.println(DuplicateTitle);
}

}
