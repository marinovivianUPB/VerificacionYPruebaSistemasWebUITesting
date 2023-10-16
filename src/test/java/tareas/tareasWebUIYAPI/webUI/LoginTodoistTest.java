package tareas.tareasWebUIYAPI.webUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import session.Session;
import tareas.tareasWebUIYAPI.webUI.pagesTodoist.LoginPage;
import tareas.tareasWebUIYAPI.webUI.pagesTodoist.MainPage;
import tareas.tareasWebUIYAPI.webUI.pagesTodoist.WorkspacePage;

public class LoginTodoistTest {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    WorkspacePage workspacePage = new WorkspacePage();

    String email = "prueba65785@prueba65785.com";
    String password = "abc456gh9";

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }

    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("https://todoist.com/");
    }
    @Test
    public void loginTesting() throws InterruptedException {
        mainPage.loginButton.click();
        Thread.sleep(3000);
        loginPage.emailTextBox.setText(email);
        loginPage.passwordTextBox.setText(password);
        loginPage.loginButton.click();
        Thread.sleep(10000);
        Assertions.assertTrue(workspacePage.profileButton.isControlDisplayed(), "ERROR no se pudo iniciar sesion");
    }
}
