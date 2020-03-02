package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.LINK_TEXT, using = "Bank & Cash")
	WebElement BankCash;

	@FindBy(how = How.LINK_TEXT, using = "New Account")
	WebElement NewAccount;

	public void GoToNewAccount() {
		BankCash.click();
		NewAccount.click();
	}

}
