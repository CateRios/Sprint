package es.ulpgc.caterina.rios101.sprint.app;

import android.app.Application;

import es.ulpgc.caterina.rios101.sprint.ContadorState;
import es.ulpgc.caterina.rios101.sprint.app.reset.ResetState;

public class AppMediator extends Application {

    private ContadorState contadorState;

    private ResetState resetState;

    @Override
    public void onCreate(){
        super.onCreate();

        contadorState = new ContadorState(0,0);
    }

    public ContadorState getContadorState() {
        return contadorState;
    }

    public void setContadorState(ContadorState contadorState) {
        this.contadorState = contadorState;
    }

    public ResetState getResetState() {
        return resetState;
    }

    public void setResetState(ResetState resetState) {
        this.resetState = resetState;
    }

}
