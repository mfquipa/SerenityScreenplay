package is.serenity.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewProductUi {
    public static Target NOMBRE_PROD=Target.the("nombre producto")
            .located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_ProductName']"));

    public static Target BTN_IMAGEN =Target.the("boton cargar imagen")
            .locatedBy("//div[@data-action='add-file']");

    public static Target SUBIR_IMAGEN= Target.the("subir imagen")
            .located(By.xpath("//div[@id='Serenity_Demo_Northwind_ProductDialog9_ProductImage']"));

    public static Target LIST_PROOVEDOR= Target.the("lista de proovedores")
            .located(By.xpath("//div[@id='s2id_Serenity_Demo_Northwind_ProductDialog9_SupplierID']"));

    public static Target SELEC_PROOVEDOR=Target.the("seleccionar proovedor")
            .located(By.xpath("//span[@class='select2-chosen"));
    public static Target LIST_CATEGORIA=Target.the("lista de categorias")
            .located(By.xpath("//div[@id='s2id_Serenity_Demo_Northwind_ProductDialog9_CategoryID']"));
    public static Target SELEC_CATEGORIA=Target.the("seleccionar categoria")
            .located(By.xpath("//a/span[@id='select2-chosen-4']]"));
    public static Target INPUT_CANT=Target.the("cantidad por unidad")
            .located(By.xpath("input[@id='Serenity_Demo_Northwind_ProductDialog9_QuantityPerUnit']"));

    public static Target INPUT_PRECIO=Target.the("precio unitario")
            .located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_UnitPrice']"));

    public static Target INPUT_STOCK=Target.the("digitar stock")
            .located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_UnitsInStock']"));

    public static Target INPUT_ORDEN=Target.the("digitar orden")
            .located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_UnitsOnOrder']"));
    public static Target INPUT_NIVEL=Target.the("digitar nivel")
            .located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_ReorderLevel']"));

    public static Target BTN_GUARDAR=Target.the("guardar y cerrar")
            .located(By.xpath("//div[@data-action='save-and-close']"));
}
