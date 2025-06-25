package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "output")
    private WebElement resultOutput;

    @FindBy(id = "backToHomeBtn")
    private WebElement backToHomeButton;

    public String getOutput() {
        return resultOutput.getText();
    }

    public void clickBackToHome() {
        backToHomeButton.click();
    }
}
