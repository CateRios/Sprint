package es.ulpgc.caterina.rios101.sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

public class ContadorPresenter implements ContadorContract.Presenter {

    public static String TAG = ContadorPresenter.class.getSimpleName();

    private WeakReference<ContadorContract.View> view;
    private ContadorViewModel viewModel;
    private ContadorContract.Model model;
    private ContadorContract.Router router;

    public ContadorPresenter(ContadorState state) {
        viewModel = state;
    }

    @Override
    public void injectView(WeakReference<ContadorContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(ContadorContract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(ContadorContract.Router router) {
        this.router = router;
    }

    @Override
    public void fetchData() {
        // Log.e(TAG, "fetchData()");

        // set passed state
        ContadorState state = router.getDataFromPreviousScreen();
        if (state != null) {
            viewModel.data = state.data;
        }

        if (viewModel.data == null) {
            // call the model
            String data = model.fetchData();

            // set initial state
            viewModel.data = data;
        }

        // update the view
        view.get().displayData(viewModel);

    }

    @Override
    public void updateContadorData(){
        //En caso de llegar al 9 volver al 0
        if(viewModel.contador == 9){
            viewModel.contador = 0;
        }
        viewModel.contador = viewModel.contador + 1;
        viewModel.data = "" + viewModel.contador;

    }


}
