package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ultilities.Driver;

public class DemoPage {
  public DemoPage(){
      PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//li[@id=‘item-1’])[1]")
    public WebElement alertSekmesi;
    @FindBy(xpath = "//button[@id=‘timerAlertButton’]")
    public WebElement alertButton;
}
