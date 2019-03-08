package es.ulpgc.caterina.rios101.sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class ContadorModel implements ContadorContract.Model {

    public static String TAG = ContadorModel.class.getSimpleName();

    private String data;

    public ContadorModel(String data) {
        this.data = data;
    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return data;
    }
}
