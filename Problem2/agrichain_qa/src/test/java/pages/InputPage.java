package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputPage extends BasePage {

    public InputPage(WebDriver driver) {
        super(driver);
    }

    // Locators (assumed as per your screenshots)
    @FindBy(id = "stringInput")
    private WebElement inputField;

    @FindBy(id = "submitBtn")
    private WebElement submitButton;

    @FindBy(linkText = "Login")
    private WebElement loginLink;

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    // Actions
    public void openPage() {
        driver.get("https://agrichain.com/qa/input");
    }

    public void enterString(String text) {
        inputField.clear();
        inputField.sendKeys(text);
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public boolean isLoginLinkVisible() {
        return loginLink.isDisplayed();
    }

    public boolean isRegisterLinkVisible() {
        return registerLink.isDisplayed();
    }
}
