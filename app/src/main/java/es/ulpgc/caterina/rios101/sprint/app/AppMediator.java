package es.ulpgc.caterina.rios101.sprint.app;

import android.app.Application;

import es.ulpgc.caterina.rios101.sprint.ContadorState;

public class AppMediator extends Application {

    private ContadorState contadorState;

    @Override
    public void onCreate(){
        super.onCreate();

        contadorState = new ContadorState();
    }

    public ContadorState getContadorState() {
        return contadorState;
    }

    public void setContadorState(ContadorState contadorState) {
        this.contadorState = contadorState;
    }

}
