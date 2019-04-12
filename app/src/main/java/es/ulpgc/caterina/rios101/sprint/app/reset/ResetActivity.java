package es.ulpgc.caterina.rios101.sprint.app.reset;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import es.ulpgc.caterina.rios101.sprint.R;

public class ResetActivity
        extends AppCompatActivity implements ResetContract.View {

    public static String TAG = ResetActivity.class.getSimpleName();

    private ResetContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        // do the setup
        ResetScreen.configure(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchData();
    }

    @Override
    public void injectPresenter(ResetContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(ResetViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        ((TextView) findViewById(R.id.data)).setText(viewModel.data);
    }
}
