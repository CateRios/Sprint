package es.ulpgc.caterina.rios101.sprint;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import es.ulpgc.caterina.rios101.sprint.app.AppMediator;
import es.ulpgc.caterina.rios101.sprint.app.reset.ResetActivity;
import es.ulpgc.caterina.rios101.sprint.app.reset.ResetState;

public class ContadorRouter implements ContadorContract.Router {

    public static String TAG = ContadorRouter.class.getSimpleName();

    private AppMediator mediator;

    public ContadorRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, ResetActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(ContadorState state) {
        mediator.setContadorState(state);
    }

    @Override
    public ResetState getDataFromPreviousScreen() {
        ResetState state = mediator.getResetState();
        return state;
    }
}
