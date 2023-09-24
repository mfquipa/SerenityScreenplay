package is.serenity.demo.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsUi {
    public static Target BTN_NEW= Target.the("Nuevo producto")
            .located(By.xpath("//div[@class='tool-button add-button icon-tool-button']"));
}
