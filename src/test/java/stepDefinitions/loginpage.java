package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage {
	
	WebDriver driver=new ChromeDriver();
	
	@Given("I launch the URL")
	public void i_launch_the_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		

	}

	@When("I enter Username and Password")
	public void i_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I Click on Login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("It should navigate to Home Page")
	public void it_should_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
