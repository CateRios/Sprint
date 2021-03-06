package es.ulpgc.caterina.rios101.sprint.app.reset;

import java.lang.ref.WeakReference;

import es.ulpgc.caterina.rios101.sprint.ContadorState;

public class ResetPresenter implements ResetContract.Presenter {

    public static String TAG = ResetPresenter.class.getSimpleName();

    private WeakReference<ResetContract.View> view;
    private ResetViewModel viewModel;
    private ResetContract.Model model;
    private ResetContract.Router router;

    public ResetPresenter(ResetState state) {
        viewModel = state;
    }

    @Override
    public void injectView(WeakReference<ResetContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(ResetContract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(ResetContract.Router router) {
        this.router = router;
    }

    @Override
    public void fetchData() {


        // set passed state
       ContadorState state = router.getDataFromPreviousScreen();

        if(state != null){
            viewModel.data = "" + state.contadorDeClicks;
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
    public void reset(){
        ResetState resetState = new ResetState();
        resetState.setContador(0);
        resetState.setContadorDeClicks(0);
        router.passDataToNextScreen(resetState);
        router.navigateToNextScreen();
    }


}
