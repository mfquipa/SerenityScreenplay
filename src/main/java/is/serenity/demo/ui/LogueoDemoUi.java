package is.serenity.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogueoDemoUi {

    public static Target TXT_USUARIO = Target.the("Text usuario")
            .located(By.id("LoginPanel0_Username"));

    public static Target TXT_CONTRASENA = Target.the("Text contrasena")
            .located(By.id("LoginPanel0_Password"));

    public static Target BTN_LOGIN = Target.the("Boton login")
            .located(By.id("LoginPanel0_LoginButton"));
}
