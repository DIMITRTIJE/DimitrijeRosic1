package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    @FindBy(xpath = "//input[@id = 'wpName1']")
    WebElement userNameField;

    @FindBy(xpath = "//input[@id = 'wpPassword1']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@id = 'wpLoginAttempt']")
    WebElement loginButton;
    @FindBy(xpath = "//a[@title = 'Log out']")
    WebElement logoutButton;

    ChromeDriver driver = null;

    //konstruktor

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
        driver.get(Strings.LOGIN_PAGE_URL);
        PageFactory.initElements(driver, this);
        assert driver.getCurrentUrl().equals(Strings.LOGIN_PAGE_URL) : "User is not on Login page";
    }

    /**
     * This method clicks on a field and enters username
     *
     * @param name
     */
    public void enterUserName(String name) {
        assert userNameField.isDisplayed() : "Username field is not present";
        userNameField.click();
        userNameField.sendKeys(name);
    }

    /**
     * @param password
     */
    public void enterPassword(String password) {
        assert passwordField.isDisplayed() : "Password field is not present";
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        assert loginButton.isDisplayed() : "Login button is not present";
        loginButton.click();
    }

    /**
     * @param userName
     * @param password
     */
    public void logInUser(String userName, String password) {
        enterUserName(userName);
        enterPassword(password);
        clickLoginButton();
    }

    public void logoutUser() {
        assert logoutButton.isDisplayed() : "Logout is not present";
        logoutButton.click();

    }
}
