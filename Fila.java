import java.util.LinkedList;

public class Fila {
    private static Fila instancia;

    private Fila() {
        lista = new Fila();
    }

    public static Fila getInstancia() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }

}
