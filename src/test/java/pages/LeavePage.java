package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LeavePage extends Form {
    private final ILabel leaveHeader = getElementFactory().getLabel(By.xpath( "//span[@class='oxd-topbar-header-breadcrumb']"),"Leave Page Header");
    private final IButton applyButton = getElementFactory().getButton(By.xpath("//a[normalize-space()='Apply']"),"Apply Button");
    
    public LeavePage(){
        super(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']"),"Leave Page");
    }

    @Step("Getting the leave page header text")
    public String getLeavePageHeaderText(){
        return leaveHeader.getText();
    }
    
    @Step("Click the apply button")
    public void clickApplyButton(){
        applyButton.clickAndWait();
    }
}
