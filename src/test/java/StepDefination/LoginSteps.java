package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  {
	
	WebDriver driver;
	@Given("Open browser")
	public void open_browser() {
	   driver=new FirefoxDriver();
	  
	}

	@And("Enter url on the browser")
	public void enter_url_on_the_browser() throws Exception{
		 driver.navigate().to("https://www.rrbapply.gov.in/#/auth/home");
		 Thread.sleep(5000);
	}

	@When("Type valid username and password")
	public void type_valid_username_and_password() throws InterruptedException {
	    driver.findElement(By.id("login_userName_id")).sendKeys("vishalmachhare@gmail.com");
	    driver.findElement(By.id("login_password_id")).sendKeys("#Vishal@1999");
        Thread.sleep(3000);
	    
	}

	@And("Enter on the login button")
	public void enter_on_the_login_button() {	
	    driver.findElement(By.xpath("/html/body/app-root/app-home/app-login/div[2]/div/div/div/div/div/div[5]/button")).click();

	}

	@Then("User should navigate to the home page")
	public void user_should_navigate_to_the_home_page() {
	//  driver.getPageSource().contains("");
	  driver.close();
	  driver.quit();
	}

}
