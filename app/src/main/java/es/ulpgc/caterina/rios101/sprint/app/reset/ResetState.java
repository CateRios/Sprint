package es.ulpgc.caterina.rios101.sprint.app.reset;

public class ResetState extends ResetViewModel {

    private int contadorDeClicks;
    private int contador;

    public void setContadorDeClicks(int contadorDeClicks) {
        this.contadorDeClicks = contadorDeClicks;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContadorDeClicks() {
        return contadorDeClicks;
    }

    public int getContador() {
        return contador;
    }

}

