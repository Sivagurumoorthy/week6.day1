package stepdel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass2 {
	public static String Captureid;
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
@When("Click on Phone")
public void clickOnPhone() {
	driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Phone']")).click();
   
}
@Given("Enter phone number")
public void enterPhoneNumber() {
	 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8870419483");
}
@When("Click find leads button")
public void clickFindLeadsButton() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
}
@When("Click First Resulting lead")
public void clickFirstResultingLead() throws InterruptedException {
	Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
}
@When("Click Delete")
public void clickDelete() {
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	System.out.println("SUCCESSFULLY DELETED");
}


	

}


