package valuemomentum;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinitions
{
	WebDriver Driver;
	
    @Given("User is on Home Page")
    public void user_is_on_home_page() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnaraniv\\Downloads\\chromedriver_win32 (1)\\chrome_driver.exe");
		WebDriver driver=new WebDriver();
		driver.get("http:\\www.amazon.in");
        
    }




    @Then("User enter search keyword")
    public void user_enter_search_keyword() {
        
    }
    @When("User hits on search button")
    public void user_hits_on_search_button() {
       
    }
    @Then("USer should land in search resulta")
    public void u_ser_should_land_in_search_resulta() {
        
    }




}
