package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.DashboardPage;
import page.LoginPage;
import page.NewAccountPage;
import util.BrowserFactory;
import util.ExcelReader;

public class NewAccountTest {

	ExcelReader reader = new ExcelReader("./data/Fall2019-Two.xlsx");

	String email = reader.getCellData("Sheet1", "User", 2);
	String password = reader.getCellData("Sheet1", "Password", 2);
	String title = reader.getCellData("Sheet1", "ATitle", 2);
	String description = reader.getCellData("Sheet1", "Description", 2);
	String balance = reader.getCellData("Sheet1", "Balance", 2);
	

	@Test

	public void NewAccount() throws Exception {

		WebDriver driver = BrowserFactory.startBrowser();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		loginpage.login(email, password);
		
		DashboardPage dash = PageFactory.initElements(driver, DashboardPage.class);
		Thread.sleep(5000);

		dash.GoToNewAccount();
		
		NewAccountPage newaccount = PageFactory.initElements(driver, NewAccountPage.class);

		newaccount.FillUpNewAccountForm(title, description, balance);
		Thread.sleep(5000);

		driver.close();

		driver.quit();
	}

}
