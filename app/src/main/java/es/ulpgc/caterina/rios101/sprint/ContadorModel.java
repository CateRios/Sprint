package es.ulpgc.caterina.rios101.sprint;


public class ContadorModel implements ContadorContract.Model {

    public static String TAG = ContadorModel.class.getSimpleName();

    private int contador;
    private int contadorDeClicks;

    public ContadorModel() {

    }

    @Override
    public int fetchData() {
        return getContador();
    }

    @Override
    public void incrementarContador(){
        if(contador < 9){
            contador = contador +1;
        }else{
            contador = 0;
        }

    }

    @Override
    public void incrementarClicks(){
        contadorDeClicks = contadorDeClicks +1;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContadorDeClicks() {
        return contadorDeClicks;
    }

    public void setContadorDeClicks(int contadorDeClicks) {
        this.contadorDeClicks = contadorDeClicks;
    }
}
