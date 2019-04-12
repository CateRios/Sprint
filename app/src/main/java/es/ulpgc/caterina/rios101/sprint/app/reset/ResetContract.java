package es.ulpgc.caterina.rios101.sprint.app.reset;

import java.lang.ref.WeakReference;

interface ResetContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(ResetViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();
    }

    interface Model {
        String fetchData();
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(ResetState state);

        ResetState getDataFromPreviousScreen();
    }
}
