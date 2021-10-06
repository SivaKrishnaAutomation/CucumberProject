package com.stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertTest {
	
	WebDriver driver;

	@Given("User launches chrome browser with url")
	public void user_launches_chrome_browser_with_url() {
	   
		System.setProperty("webdriver.chrome.driver", "ChromeDriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	}

	@When("User clicks on click me button")
	public void user_clicks_on_click_me_button() {
	    
		WebElement el= driver.findElement(By.xpath("//button[@id='promptBox']"));
		el.click();
	}

	@Then("User should view the alert")
	public void user_should_view_the_alert() {
	    
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("TestAlert");
	}
	
}
