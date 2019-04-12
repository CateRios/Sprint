package es.ulpgc.caterina.rios101.sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;

public class ContadorModel implements ContadorContract.Model {

    public static String TAG = ContadorModel.class.getSimpleName();

    private int contador;

    public ContadorModel() {

    }

    @Override
    public int fetchData() {
        // Log.e(TAG, "fetchData()");
        return contador;
    }

    @Override
    public void incrementarContador(){
        if(contador < 9){
            contador = contador +1;
        }else{
            contador = 0;
        }

    }
}
