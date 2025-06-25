package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.InputPage;
import pages.ResultPage;
import utils.DriverFactory;

public class LongestSubstringTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.initDriver();
    }

    @Test(description = "Verify longest substring output for valid input")
    public void testLongestSubstring() {
        InputPage inputPage = new InputPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        inputPage.openPage();
        inputPage.enterString("abcabcbb");
        inputPage.clickSubmit();

        String result = resultPage.getOutput();
        Assert.assertEquals(result, "3", "Incorrect output for longest substring");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
