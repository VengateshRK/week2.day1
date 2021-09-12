package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class createLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// webdriver setup
		WebDriverManager.chromedriver().setup();
		// // WebDriverManager.edgedriver().setup();
		// WebDriverManager.firefoxdriver().setup();

		// Step 2: Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// step 3: maximize the browser
		driver.manage().window().maximize();
		// step 4: the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// get title
		String title = driver.getTitle();
		System.out.println(" title is " + title);

		// Step 6: Enter username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");

		// Step 7: Enter Password
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");

		// click on the Login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

//				WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
//	crmsfaLink.click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		WebElement LeadsPage = driver.findElement(By.linkText("Leads"));
		LeadsPage.click();

		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		WebElement createLeadForm_companyName = driver.findElement(By.id("createLeadForm_companyName"));
		createLeadForm_companyName.sendKeys("Testleaf");

		WebElement createLeadForm_firstName = driver.findElement(By.id("createLeadForm_firstName"));
		createLeadForm_firstName.sendKeys("vengatesh");
		WebElement createLeadForm_lastName = driver.findElement(By.id("createLeadForm_lastName"));
		createLeadForm_lastName.sendKeys("RK");
		WebElement createLeadForm_firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		createLeadForm_firstNameLocal.sendKeys("Sheriba");
		WebElement createLeadForm_lastNameLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		createLeadForm_lastNameLocal.sendKeys("TS");
		WebElement createLeadForm_generalProfTitle =driver.findElement(By.id("createLeadForm_generalProfTitle"));
		createLeadForm_generalProfTitle.sendKeys("Mrs.");
		WebElement createLeadForm_birthDate= driver.findElement(By.id("createLeadForm_birthDate"));
		createLeadForm_birthDate.sendKeys("08/05/1989");
		WebElement createLeadForm_primaryPhoneCountryCode= driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		createLeadForm_primaryPhoneCountryCode.sendKeys("+91");
		WebElement createLeadForm_primaryPhoneAreaCode= driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		createLeadForm_primaryPhoneAreaCode.sendKeys("nil");
		WebElement createLeadForm_primaryPhoneNumber= driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		createLeadForm_primaryPhoneNumber.sendKeys("9629017683");
		WebElement createLeadForm_primaryPhoneExtension= driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		createLeadForm_primaryPhoneExtension.sendKeys("nil");
		WebElement createLeadForm_primaryPhoneAskForName=driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		createLeadForm_primaryPhoneAskForName.sendKeys("Vengatesh");
		WebElement createLeadForm_primaryEmail=driver.findElement(By.id("createLeadForm_primaryEmail"));
		createLeadForm_primaryEmail.sendKeys("vengatesh.rk@gmail.com");
		WebElement createLeadForm_primaryWebUrl=driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		createLeadForm_primaryWebUrl.sendKeys("http://leaftaps.com/opentaps/control/main");
		WebElement createLeadForm_generalToName=driver.findElement(By.id("createLeadForm_generalToName"));
		createLeadForm_generalToName.sendKeys("Vengatesh");
		WebElement createLeadForm_generalAttnName= driver.findElement(By.id("createLeadForm_generalAttnName"));
		createLeadForm_generalAttnName.sendKeys("Vengatesh");
		WebElement createLeadForm_generalAddress1=driver.findElement(By.id("createLeadForm_generalAddress1"));
		createLeadForm_generalAddress1.sendKeys("41/22, Everest colony");
		WebElement createLeadForm_generalAddress2=driver.findElement(By.id("createLeadForm_generalAddress2"));
		createLeadForm_generalAddress1.sendKeys("JJ nagar");
		WebElement createLeadForm_generalCity=driver.findElement(By.id("createLeadForm_generalCity"));
		createLeadForm_generalCity.sendKeys("Chennai");
		WebElement createLeadForm_generalStateProvinceGeoId=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		createLeadForm_generalStateProvinceGeoId.sendKeys("Tamilnadu");
		WebElement createLeadForm_generalPostalCode=driver.findElement(By.id("createLeadForm_generalPostalCode"));
		createLeadForm_generalPostalCode.sendKeys("600037");
		WebElement createLeadForm_generalCountryGeoId =driver.findElement(By.name("generalCountryGeoId"));
		createLeadForm_generalCountryGeoId.sendKeys("India");
		WebElement smallSubmit = driver.findElement(By.className("smallSubmit"));
		smallSubmit.click();
		
			}

}
