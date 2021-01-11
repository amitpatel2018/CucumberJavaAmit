package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;

public class TextboxTest {
	WebDriver driver;
	@Given("user navigated to demoqa website")
	public void user_navigated_to_demoqa_website() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.demoqa.com");
	}
	@And("user clicks on Elements")
	public void user_clicks_on_elements() {
	    WebElement element = driver.findElement(By.xpath("//div[@class='card-body']/h5[text() = 'Elements']"));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
	    element.click();
	}
	@And("user clicks on Textbox")
	public void user_clicks_on_textbox() {
	    driver.findElement(By.xpath("//li[@id='item-0']//span[@class='text']")).click();
	}
	@And("^user enters fullName as (.*)$")
	public void user_enters_full_name(String fullName) {
	    driver.findElement(By.id("userName")).sendKeys(fullName);
	}
	@And("^user enters email address as (.*)$")
	public void user_enters_email_address(String emailAddress) {
	    driver.findElement(By.id("userEmail")).sendKeys(emailAddress);
	}
	@And("^user enters current address as (.*)$")
	public void user_enters_current_address(String cAddress) {
	    driver.findElement(By.id("currentAddress")).sendKeys(cAddress);
	}
	@And("^user enters permanent address as (.*)$")
	public void user_enters_permanent_address(String pAddress) {
	    driver.findElement(By.id("permanentAddress")).sendKeys(pAddress);
	}
	@When("user clicks on Submit")
	public void user_clicks_on_submit() {
	    WebElement submitButton = driver.findElement(By.id("submit"));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", submitButton);
	    submitButton.click();
	}
	@Then("All user entered details displayed")
	public void all_user_entered_details_displayed() {
	    String name = driver.findElement(By.id("name")).getText();
	    System.out.println(name);
	    assertEquals("Name:John Paul", name);
	    System.out.println("test passed....");
	    driver.quit();
	}
}
