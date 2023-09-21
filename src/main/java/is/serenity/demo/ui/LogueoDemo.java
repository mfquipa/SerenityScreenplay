package is.serenity.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogueoDemo {

public static Target TXT_USUARIO = Target.the("Text usuario")
        .located(By.id("LoginPanel0_Username"));

    public static Target TXT_CONTRASEÑA = Target.the("Text contraseña")
            .located(By.id("LoginPanel0_Password"));

    public static Target BTN_LOGIN = Target.the("Boton login")
            .located(By.id("LoginPanel0_LoginButton"));

    public static Target FIRST_NAV_MENU_ITEM = Target.the("First Nav Menu Item")
            .located(By.xpath("//a[@href='#nav_menu1_2_1']"));
}
