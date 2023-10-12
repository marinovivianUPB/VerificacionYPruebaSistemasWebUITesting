package selenium.testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginSection;
import pages.MainPage;
import pages.MenuSection;
import session.Session;

public class LoginTest {

    MenuSection menuSection = new MenuSection();
    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }

    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
    @Test
    public void loginTesting(){
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("upbapi@upbapi.com");
        loginSection.passwordTextBox.setText("12345");
        loginSection.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR no se pudo iniciar sesion");
    }
}
