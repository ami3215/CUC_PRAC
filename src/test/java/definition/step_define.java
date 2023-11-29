package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_define {
	public static String url = "https://demo.guru99.com/test/newtours/login.php";
    WebDriver driver;
    ExtentHtmlReporter htmlreporter;
    ExtentReports extent;
    ExtentTest test;
    
    @Given("I should be on the login page")
    public void i_should_be_on_the_login_page() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @And("Enter the UserName")
    public void enter_the_user_name() throws InterruptedException {
    	htmlreporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlreporter);
        test = extent.createTest("Guru Report");
		driver.findElement(By.name("userName")).sendKeys("user"); 
		test.pass("I entered the username");
		Thread.sleep(3000);
    }

    @And("Enter the Password")
    public void enter_the_password() throws InterruptedException {
    	driver.findElement(By.name("password")).sendKeys("user"); 
		test.pass("I entered the password");
		Thread.sleep(3000);
    }

    @When("Click on Submit button")
    public void click_on_submit_button() throws InterruptedException {
    	driver.findElement(By.name("submit")).click(); 
		test.pass("I clicked on Submit button");
		Thread.sleep(3000);
    }

    @Then("I should see the title as {string}")
    public void i_should_see_the_title_as(String string) throws InterruptedException {
	     String atitle = driver.getTitle();
	     String etitle=string;
	     Assert.assertEquals(etitle, atitle);
	     test.pass("I should see the page with title as'Login:Mercury Tours'");
	     Thread.sleep(3000);
    }

    @And("I should click on register button")
    public void i_should_click_on_register_button() {
    	driver.findElement(By.linkText("REGISTER")).click();
 	    test.pass("I clicked on REGISTER button");
    }
    
    @When("I should see the page title as {string}")
    public void i_should_see_the_page_title_as(String string) throws InterruptedException {
    	 String etitle = "Register: Mercury Tours";
	     String atitle = driver.getTitle();
	     Assert.assertEquals(etitle, atitle);
	     test.pass("I should see the page with title as'Register:Mercury Tours'");
	     Thread.sleep(3000);
    }

    @And("Enter the FirstName")
    public void enter_the_first_name() throws InterruptedException {
    	driver.findElement(By.name("firstName")).sendKeys("Admin"); 
		test.pass("I entered the firstname");
		Thread.sleep(2000);
    }

    @And("Enter the LastName")
    public void enter_the_last_name() throws InterruptedException {
    	driver.findElement(By.name("lastName")).sendKeys("abc"); 
		test.pass("I entered the lastname");
		Thread.sleep(2000);
    }

    @And("Enter the PhoneNumber")
    public void enter_the_phone_number() throws InterruptedException {
    	driver.findElement(By.name("phone")).sendKeys("5364546545"); 
		test.pass("I entered the phone number");
		Thread.sleep(2000);
    }

    @And("Enter the Email")
    public void enter_the_email() throws InterruptedException {
    	driver.findElement(By.name("userName")).sendKeys("hgcfhgfhg@hvhjj.cuyt"); 
		test.pass("I entered the email");
		Thread.sleep(2000);
    }

    @And("Enter the Address")
    public void enter_the_address() throws InterruptedException {
    	driver.findElement(By.name("address1")).sendKeys("dqawhsdajdnasm csmnbdqwhjbdjhqwwdwqjdvwdwhdbwhjdbwhjbdwhjbdqwhjbdqwhjbdwhjqbdqwhjbdqwjkdbqwjd");
		test.pass("I entered the address");
		Thread.sleep(2000);
    }

    @And("Enter the City")
    public void enter_the_city() throws InterruptedException {
    	driver.findElement(By.name("city")).sendKeys("akjxnnxks"); 
		test.pass("I entered the city");
		Thread.sleep(2000);
    }

    @And("Enter the State\\/Province")
    public void enter_the_state_province() throws InterruptedException {
    	driver.findElement(By.name("state")).sendKeys("scdkcmd"); 
		test.pass("I entered the state");
		Thread.sleep(2000);
    }

    @And("Enter the PostalCode")
    public void enter_the_postal_code() throws InterruptedException {
    	driver.findElement(By.name("postalCode")).sendKeys("795655"); 
		test.pass("I entered the postalcode");
		Thread.sleep(2000);
    }

    @And("Select the Country")
    public void select_the_country() throws InterruptedException {
    	WebElement country = driver.findElement(By.name("country"));
		Select option = new Select(country);
		option.selectByIndex(10);
		test.pass("I selected the country");
		Thread.sleep(2000);
    }
    
    @And("Enter the UserName of RegisterPage")
    public void enter_the_user_name_of_register_page() throws InterruptedException {
    	driver.findElement(By.name("email")).sendKeys("adnsjsn");
		test.pass("I entered the username");
		Thread.sleep(2000);
    }

    @And("Enter the Password of RegisterPage")
    public void enter_the_password_of_register_page() throws InterruptedException {
    	driver.findElement(By.name("password")).sendKeys("kdjnsdkj232");
		test.pass("I entered the password");
		Thread.sleep(2000);
    }

    @And("Enter the ConfirmPassword")
    public void enter_the_confirm_password() throws InterruptedException {
    	driver.findElement(By.name("confirmPassword")).sendKeys("kdjnsdkj232");
		test.pass("I entered the confirmpassword");
		Thread.sleep(2000);
    }
    @When("Click on Submit button for RegisterPage")
    public void click_on_submit_button_for_register_page() throws InterruptedException {
    	driver.findElement(By.name("submit")).click(); 
		test.pass("I clicked on Submit button");
		Thread.sleep(2000);
    }
    
    @Then("I should see the title for successfully registered as {string}")
    public void i_should_see_the_title_for_successfully_registered_as(String string) throws InterruptedException {
    	 String etitle = "Register: Mercury Tours";
	     String atitle = driver.getTitle();
	     Assert.assertEquals(etitle, atitle);
	     test.pass("I should see the page with title as'Register:Mercury Tours'");
	     Thread.sleep(2000);
    }

    @Given("I should click on Sign-off button")
    public void i_should_click_on_sign_off_button() throws InterruptedException {
    	driver.findElement(By.linkText("SIGN-OFF")).click();
	    test.pass("I clicked on SIGN-OFF button");
	    Thread.sleep(3000);
    }

    @When("Click on Sign-on button")
    public void click_on_sign_on_button() throws InterruptedException {
    	driver.findElement(By.linkText("SIGN-ON")).click();
	    test.pass("I clicked on SIGN-ON button");
	    Thread.sleep(2000);
    }
    
    @Then("I should see the page whose title as {string}")
    public void i_should_see_the_page_whose_title_as(String string) throws InterruptedException {
    	 String etitle = string;
	     String atitle = driver.getTitle();
	     Assert.assertEquals(etitle, atitle);
	     Thread.sleep(3000);
	     test.pass("I should see the page with title as'Sign-on:Mercury Tours'");
	     extent.flush();
	     driver.close();
    }
}
