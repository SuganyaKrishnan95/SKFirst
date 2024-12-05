package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Widgets {

	WebDriver driver=new ChromeDriver();	
	
	@Given("I launch the Widgets URL")
	public void i_launch_the_widgets_url() {
		
        driver.get("https://demoqa.com/widgets");
		
		driver.manage().window().maximize();
		
	    
	}

	@When("I Click on Accordion")
	public void i_click_on_accordion() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']/span")).click();
		
			
		Thread.sleep(2000);
	    
	}

	@Then("I verify Accordion actions")
	public void i_verify_accordion_actions() {
		
		WebElement Accordian1=driver.findElement(By.xpath("//div[@ID='section1Heading']"));
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", Accordian1);
		
		  String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		  
		  WebElement actText=driver.findElement(By.xpath("//div[@ID='section1Content']"));
		  String Atext=actText.getText();
		  
	      // getPageSource() to get page source
	      if ( driver.getPageSource().contains("Lorem Ipsum is simply dummy text of the printing")){
	         System.out.println("Text: " + text + " is present. ");
	      } else {
	         System.out.println("Text: " + text + " is not present. ");
	      }
	      
	     
		js1.executeScript("arguments[0].click();", Accordian1);
	      
	      driver.quit();
		
	}


}
