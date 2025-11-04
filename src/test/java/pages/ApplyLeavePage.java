package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LeaveType;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ApplyLeavePage extends Form {
    private final ILabel applyLeaveHeader = getElementFactory().getLabel(By.xpath( "//h6[normalize-space()='Apply Leave']"),"Leave Page Header");
    private final ILabel leaveTypeErrorMsg = getElementFactory().getLabel(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][normalize-space()='Required']"),"Leave Type Error Header");
    private final ILabel fromDateErrorMsg = getElementFactory().getLabel(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//span[1]"),"From Date Error Header");
    private final ILabel toDateErrorMsg = getElementFactory().getLabel(By.xpath("//div[@class='oxd-form-row']//div[2]//div[1]//span[1]"),"To Date Error Header");
    private final IButton applyButton = getElementFactory().getButton(By.xpath( "//button[normalize-space()='Apply']"),"Apply Button");
    private final IComboBox leaveTypeButton = getElementFactory().getComboBox(By.xpath("//div[@class='oxd-select-text-input']"), "leave Type Dropdown", ElementState.EXISTS_IN_ANY_STATE);
    
    
    
    public ApplyLeavePage(){
        super(By.xpath("//h6[normalize-space()='Apply Leave']"),"Apply leave Page");
    }

    @Step("Getting the apply leave page text")
    public String getApplyLeavePageHeaderText(){
        return applyLeaveHeader.getText();
    }

    @Step("Getting the leave type error text")
    public String getLeaveTypeErrorText(){
        return leaveTypeErrorMsg.getText();
    }

    @Step("Getting the from date error text")
    public String getFromDataErrorText(){
        return fromDateErrorMsg.getText();
    }

    @Step("Getting the to date error text")
    public String getToDataErrorText(){
        return toDateErrorMsg.getText();
    }

    @Step("Click the apply button")
    public void clickApplyButton() {
        applyButton.click();
    }
    
    @Step("Click the leave type dropdown")
    public void clickLeaveTypeDropdown(){
        leaveTypeButton.click();
    }
    
    @Step("Select leave type: {leaveType}")
    public void selectFirstType(LeaveType leaveType) {
        leaveTypeButton.selectByValue(LeaveType.values()[0].getValue());
    }

    @Step("Select leave type: {leaveType}")
    public void selectSecondType(LeaveType leaveType) {
        leaveTypeButton.selectByValue(LeaveType.values()[1].getValue());
    }

}

    
