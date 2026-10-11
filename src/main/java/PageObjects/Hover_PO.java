package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Global_vars;

public class Hover_PO extends Base_PO {

    private @FindBy(xpath = "(//div[@id='div-hover']/div[contains(@class,'dropdown')])[1]")
    WebElement firstDropdown;

    public Hover_PO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Actions_Page() {
        navigateto_Url(Global_vars.TestURLUniv + "Actions/index.html");
    }

    public void hoverOver_FirstButton() {
        WebElement button = firstDropdown.findElement(By.cssSelector("button.dropbtn"));
        waitForVisibility(button);
        new Actions(getDriver()).moveToElement(button).perform();
    }

    public String getRevealed_ContentText() {
        WebElement content = firstDropdown.findElement(By.cssSelector(".dropdown-content"));
        waitForVisibility(content);
        return content.getText();
    }
}
