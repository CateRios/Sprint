package es.ulpgc.caterina.rios101.sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.caterina.rios101.sprint.app.reset.ResetState;

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
        // set passed state

        ResetState state = router.getDataFromPreviousScreen();

        if (state != null) {
            model.setContador(state.getContador());
            model.setContadorDeClicks(state.getContadorDeClicks());
        }

        if (viewModel.data == null) {
            // call the model
            int data = model.fetchData();

            // set initial state
            //El estado inicial es "0" -> mensaje del modelo es "0"
            viewModel.data = "" + data;
        }

        // update the view
        view.get().displayData(viewModel);

    }

    @Override
    public void updateContadorData(){
        model.incrementarContador();
        //call the model
        int data = model.fetchData();
        viewModel.data = "" + data;
        //update the view
        view.get().displayData(viewModel);
    }

    @Override
    public void updateClicks(){
        model.incrementarClicks();
    }

    @Override
    public void goToReset(){
        int contadorDeClicks = model.getContadorDeClicks();
        int contador = model.getContador();
        ContadorState state = new ContadorState(contadorDeClicks, contador);
        router.passDataToNextScreen(state);
        router.navigateToNextScreen();
    }


}
