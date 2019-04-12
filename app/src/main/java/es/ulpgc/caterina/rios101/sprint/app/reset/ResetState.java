package es.ulpgc.caterina.rios101.sprint.app.reset;

public class ResetState extends ResetViewModel {

    private int contadorDeClicks;
    private int contador;

    public ResetState(int contadorDeClicks, int contador) {
        this.contadorDeClicks = contadorDeClicks;
        this.contador = contador;
    }
}

