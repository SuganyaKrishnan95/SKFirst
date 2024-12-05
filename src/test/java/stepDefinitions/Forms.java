package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Forms {
	
	WebDriver driver=new ChromeDriver();	
	
	@Given("I launch the Demo URL")
	public void i_launch_the__demo_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		
	
					
	}

		
	@When("I Click on Forms Link")
	public void Forms_Link() {		
		

       WebElement forms=driver.findElement(By.xpath("//div/h5[contains(text(),'Forms')]/parent::div/parent::div/child::div[2]"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
	//	driver.execute_script("arguments[0].scrollIntoView()", element);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(forms));
				
		forms.click();
		
	    
	}
	
	
	@Then("I enter Values in forms")
	public void i_click_on_forms_link() throws InterruptedException {
	    
		//Practice forms click
		driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
		
//		driver.findElement(By.id("firstName")).sendKeys("Suganya");
//		driver.findElement(By.id("lastName")).sendKeys("Krishnan");
//		driver.findElement(By.id("userEmail")).sendKeys("test123@gmail.com");
	//	driver.findElement(By.id("gender-radio-2")).click();	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8658586588");	
		
		
		
		Thread.sleep(2000);
		
	WebElement Calender=driver.findElement(By.id("dateOfBirthInput"));
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("arguments[0].click();", Calender);
	
	//wait for the calendar to open
	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__month-container")));
//	
	//getting actual year and month in the calendar
	
	String aMonthYear=driver.findElement(By.className("react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown")).getText();
	//String aYear=driver.findElement(By.className("react-datepicker__year-select")).getText();
	
	System.out.println(aMonthYear); 
//	System.out.println(aYear);
	
	while(aMonthYear.equals("October 2024"));
	{
		System.out.println("inside while");
		driver.findElement(By.className("react-datepicker__navigation react-datepicker__navigation--next")).click();
		
//		driver.findElement(By.className("react-datepicker__month-select")).getText();
//		
//		aYear=driver.findElement(By.className("react-datepicker__year-select")).getText();
		
		driver.findElement(By.className("react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown")).getText();
		
		
	}
	
	driver.findElement(By.className("react-datepicker__day react-datepicker__day--004 react-datepicker__day--weekend")).click();
	
	
	
	
	
///    	dob.clear();
//		dob.sendKeys("15Oct24");
//		
//		((JavascriptExecutor)driver).executeScript("document.getElementById('dob').setAttribute('value','10 Jan 2013')");
//
//		driver.findElement(By.className("'subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3]")).sendKeys("GK");	
//		driver.findElement(By.id("hobbies-checkbox-3")).click();		
//		driver.findElement(By.id("currentAddress")).sendKeys("123,test");
//			
//		driver.findElement(By.id("submit")).click();
	
	driver.quit();
	    
	}

}
