package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_vars;

public class Scrolling_PO extends Base_PO {

    private @FindBy(id = "zone4")
    WebElement zone4;

    public Scrolling_PO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Scrolling_Page() {
        navigateto_Url(Global_vars.TestURLUniv + "Scrolling/index.html");
    }

    public void scrollTo_Zone4() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", zone4);
    }

    public boolean isZone4_InViewport() {
        return (Boolean) ((JavascriptExecutor) getDriver()).executeScript(
                "var r = arguments[0].getBoundingClientRect();"
                        + "return r.top >= 0 && r.bottom <= (window.innerHeight || document.documentElement.clientHeight);",
                zone4);
    }

    public boolean isZone4_Displayed() {
        return zone4.isDisplayed();
    }

    public String getZone4_Text() {
        return zone4.getText();
    }

    public long getScrollY() {
        return ((Number) ((JavascriptExecutor) getDriver()).executeScript("return window.pageYOffset;")).longValue();
    }
}
