package es.ulpgc.caterina.rios101.sprint;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import es.ulpgc.caterina.rios101.sprint.app.AppMediator;

public class ContadorScreen {

    public static void configure(ContadorContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);


        AppMediator mediator = (AppMediator) context.get().getApplication();
        ContadorState state = mediator.getContadorState();

        ContadorContract.Router router = new ContadorRouter(mediator);
        ContadorContract.Presenter presenter = new ContadorPresenter(state);
        //Inyectar el modelo con un "0" para el estado inicial
        ContadorContract.Model model = new ContadorModel();
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
