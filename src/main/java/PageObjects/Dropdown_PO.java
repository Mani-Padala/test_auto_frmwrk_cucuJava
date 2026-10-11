package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.Global_vars;

public class Dropdown_PO extends Base_PO {

    // the "dropdowm" typo is in the site's own ids
    private @FindBy(id = "dropdowm-menu-1")
    WebElement dropdownMenu1;

    private @FindBy(id = "dropdowm-menu-2")
    WebElement dropdownMenu2;

    public Dropdown_PO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Dropdown_Page() {
        navigateto_Url(Global_vars.TestURLUniv + "Dropdown-Checkboxes-RadioButtons/index.html");
    }

    private WebElement dropdown(String dropdownId) {
        return switch (dropdownId) {
            case "dropdowm-menu-1" -> dropdownMenu1;
            case "dropdowm-menu-2" -> dropdownMenu2;
            default -> throw new IllegalArgumentException("Unknown dropdown id: " + dropdownId);
        };
    }

    public void selectOption_ByVisibleText(String dropdownId, String optionText) {
        WebElement element = dropdown(dropdownId);
        waitForVisibility(element);
        new Select(element).selectByVisibleText(optionText);
    }

    public String getSelected_Value(String dropdownId) {
        return new Select(dropdown(dropdownId)).getFirstSelectedOption().getAttribute("value");
    }

    public String getSelected_Text(String dropdownId) {
        return new Select(dropdown(dropdownId)).getFirstSelectedOption().getText();
    }
}
