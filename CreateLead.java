package stepcreatelead;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead extends BaseClass {
	

	@And ("Load the application url")
	public void loadurl () {
		 driver.get("http://leaftaps.com/opentaps");
	}
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
	@Then("Homepage should be displayed")
	public void verifyHomepage() {
		String Title = driver.getTitle();
		if (Title.contains("Testleaf")) {
			System.out.println("login is successfull");
		}}
	@When("Click on Crmsfa")
	public void createLead() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
    @When("Click CreateLead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter Company name")
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEST LEAF");
	}
	@Given("Enter FirstName")
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SIVA GURUMOORTHY");
	}
	@Given("Enter LastName")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
	}
	@Given("Enter Mailid")
	public void enterMailid()  {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gurusmart123@gmail.com");
		}
	@When("Click submitlead button")
	public void clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		
	}
	@Then ("View Lead should be displayed")
    public void  VerifyNewLead () {
    	String title2 = driver.getTitle();
		System.out.println(title2);
		
    }



}
	
