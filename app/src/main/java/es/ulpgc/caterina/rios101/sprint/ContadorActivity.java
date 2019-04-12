package es.ulpgc.caterina.rios101.sprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContadorActivity
        extends AppCompatActivity implements ContadorContract.View {

    public static String TAG = ContadorActivity.class.getSimpleName();

    private ContadorContract.Presenter presenter;

    Button botonInc;
    Button botonReset;
    TextView textContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        getSupportActionBar().setTitle("Contador");

        botonInc = findViewById(R.id.botonInc);
        botonReset = findViewById(R.id.botonReset);
        textContador = findViewById(R.id.textContador);

        botonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.updateContadorData();
                presenter.fetchData();
            }
        });

        botonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.goToReset();
            }
        });


        // do the setup
        ContadorScreen.configure(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchData();
    }

    @Override
    public void injectPresenter(ContadorContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(ContadorViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        ((TextView) findViewById(R.id.textContador)).setText(viewModel.data);
    }
}
