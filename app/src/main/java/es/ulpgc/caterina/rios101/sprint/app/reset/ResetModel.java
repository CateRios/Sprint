package es.ulpgc.caterina.rios101.sprint.app.reset;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class ResetModel implements ResetContract.Model {

    public static String TAG = ResetModel.class.getSimpleName();

    public ResetModel() {

    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }
}
