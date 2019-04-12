package es.ulpgc.caterina.rios101.sprint;

public class ContadorState extends ContadorViewModel {

    public int contadorDeClicks;
    public int contador;

    public ContadorState(int contadorDeClicks, int contador) {
        this.contadorDeClicks = contadorDeClicks;
        this.contador = contador;
    }

}
