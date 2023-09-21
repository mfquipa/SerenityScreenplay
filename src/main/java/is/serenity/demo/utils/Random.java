package is.serenity.demo.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Random {

    public static class IndexRandom {
        public static int numeroAleatorioEnRango(int minimo, int maximo) {
    //nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
            return ThreadLocalRandom.current().nextInt(minimo, maximo);
        }
    }
}
