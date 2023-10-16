package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SettingsPopUp {
    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button okButton = new Button(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"));
}
