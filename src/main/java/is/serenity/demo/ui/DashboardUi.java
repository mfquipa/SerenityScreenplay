package is.serenity.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardUi {

    public static Target LBL_TITULO= Target.the("Titulo Dashboard")
            .located(By.xpath("//h1[text()='Dashboard']"));

    public static Target MENU_NORTHWIND = Target.the("Primer menu Northwind")
            .located(By.xpath("//a[@href='#nav_menu1_2_1']"));
    public static Target OPCION_PROD= Target.the("Productos")
            .located(By.xpath("//a[@href='/Northwind/Product']"));
}
