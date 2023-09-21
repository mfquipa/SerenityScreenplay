package is.serenity.demo.utils;

public class EsperaImplicita {
    public void esperaImplicita(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }

    }
}
