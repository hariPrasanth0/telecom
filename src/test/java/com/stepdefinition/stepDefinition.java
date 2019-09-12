package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class stepDefinition {
	public static WebDriver d;

	@Given("open web page")
	public void open_web_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens-09\\Desktop\\New folder (2)\\AarthiNS\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://demo.guru99.com/telecom/");
		d.manage().window().maximize();
	}

	@Given("click add customer")
	public void click_add_customer() {
		d.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("provide details")
	public void provide_details() {
		d.findElement(By.xpath("//label[@for='done']")).click();
		d.findElement(By.id("fname")).sendKeys("Raj");
		d.findElement(By.id("lname")).sendKeys("kumar");
		d.findElement(By.id("email")).sendKeys("ramkumar@gmail.com");
		d.findElement(By.xpath("//textarea[@id='message']")).sendKeys("chennai");
		d.findElement(By.id("telephoneno")).sendKeys("678498734");

	}

	@When("click submit")
	public void click_submit() {
		d.findElement(By.name("submit")).click();
	}

	@When("provide details.")
	public void provide_details(DataTable twod) {
		List<List<String>> tdi = twod.asLists();
		d.findElement(By.xpath("//label[@for='done']")).click();
		d.findElement(By.id("fname")).sendKeys(tdi.get(0).get(0));
		d.findElement(By.id("lname")).sendKeys(tdi.get(1).get(1));
		d.findElement(By.id("email")).sendKeys(tdi.get(2).get(2));
		d.findElement(By.xpath("//textarea[@id='message']")).sendKeys(tdi.get(3).get(3));
		d.findElement(By.id("telephoneno")).sendKeys(tdi.get(0).get(4));
	}

	@Then("verify id was genrate")
	public void verify_id_was_genrate() {
		String text = d.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
		System.out.println(text);
	}

}
