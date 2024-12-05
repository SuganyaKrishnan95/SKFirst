package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alerts {

	WebDriver driver=new ChromeDriver();
	
	
	@Given("I launch the Alerts URL")
	public void i_launch_the_alerts_url() {
	    
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		
	}

	@When("I Click on Alerts button")
	public void i_click_on_alerts_button() throws InterruptedException {
	    
		
		//Simple Alert
		
	//	driver.findElement(By.xpath("//button[@ID='alertButton']")).click();
		
	//	driver.switchTo().alert().accept();
		
		//after 5 seconds
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
//		driver.findElement(By.xpath("//button[@ID='timerAlertButton']")).click();
//		
//	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		Thread.sleep(5000);
//		
//		driver.switchTo().alert().accept();		
		
		
		//confirmation alert
		
//		driver.findElement(By.xpath("//button[@ID='confirmButton']")).click();
//		
//		driver.switchTo().alert().accept();	
//		
//		WebElement alerttext=driver.findElement(By.className("text-success"));
//		
//		String actalertText=alerttext.getText();
//		
//		String ExptAlerrtText="You selected Ok";
//		
//		Assert.assertEquals(ExptAlerrtText, actalertText);
		
		//Prompt alert
		driver.findElement(By.xpath("//button[@ID='promtButton']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("SuganyaKrishnanManoj");
		
		alert.accept();	
		
		WebElement Promtalert=driver.findElement(By.id("promptResult"));
		
		String ActPromtText=Promtalert.getText();
		
		String ExptPromtalert="You entered SuganyaKrishnanManoj";
		
		Assert.assertEquals(ExptPromtalert, ActPromtText);
		
		driver.quit();
		
	}

	@Then("I verify alerts")
	public void i_verify_alerts() {
	    
		
		
	}

	
}
