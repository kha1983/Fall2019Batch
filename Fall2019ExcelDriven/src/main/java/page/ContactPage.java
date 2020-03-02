package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactPage {

	WebDriver driver;

	public ContactPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element Library
	@FindBy(how = How.ID, using = "account")
	WebElement FullName;

	@FindBy(how = How.ID, using = "company")
	WebElement CompanyName;

	@FindBy(how = How.ID, using = "email")
	WebElement Email;

	@FindBy(how = How.ID, using = "phone")
	WebElement Phone;

	@FindBy(how = How.ID, using = "address")
	WebElement Address;

	@FindBy(how = How.ID, using = "city")
	WebElement City;

	@FindBy(how = How.ID, using = "zip")
	WebElement ZipCode;

	@FindBy(how = How.ID, using = "state")
	WebElement State;

	@FindBy(how = How.ID, using = "submit")
	WebElement Submit;

	public void FillUpContactForm() {
		FullName.sendKeys("Khadak Bahadur Kathayat");
		CompanyName.sendKeys("Citi Bank");
		Email.sendKeys("Khadak.kathayat100@gmail.com");
		Phone.sendKeys("9722158094");
		Address.sendKeys("Irving Texas");
		City.sendKeys("Irving");
		ZipCode.sendKeys("75038");
		State.sendKeys("Texas");
		Submit.click();

	}

}
