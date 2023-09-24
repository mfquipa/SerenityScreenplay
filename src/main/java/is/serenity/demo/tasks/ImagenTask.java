package is.serenity.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/*public class ImagenTask implements Task {
    private final String rutaArchivo;

    public ImagenTask(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public static ImagenTask cargarImagen(String rutaArchivo) {
        return new ImagenTask(rutaArchivo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on("//input[@type='file']"),
                WaitUntil.the("//div[@data-action='add-file']", isVisible())
        );
        try {
            Robot robot= new Robot();

            Thread
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Utiliza Robot para escribir la ruta del archivo y presionar Enter
        try {
            Robot robot = new Robot();


            // Presiona Ctrl+V para pegar la ruta del archivo
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Presiona Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }
}*/
