package pages;

import control.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"));
}
