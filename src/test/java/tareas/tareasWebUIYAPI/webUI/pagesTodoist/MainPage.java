package tareas.tareasWebUIYAPI.webUI.pagesTodoist;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//li//a[@href=\"/auth/login\"]"));
}
