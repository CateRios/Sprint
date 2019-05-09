package es.ulpgc.caterina.rios101.sprint;

import java.lang.ref.WeakReference;

import es.ulpgc.caterina.rios101.sprint.app.reset.ResetState;

interface ContadorContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(ContadorViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();

        void updateContadorData();

        void updateClicks();

        void goToReset();
    }

    interface Model {

        int fetchData();

        void incrementarContador();

        void incrementarClicks();

        public int getContador();

        public void setContador(int contador);

        public int getContadorDeClicks();

        public void setContadorDeClicks(int contadorDeClicks);

    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(ContadorState state);

        ResetState getDataFromPreviousScreen();
    }
}
