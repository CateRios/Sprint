package es.ulpgc.caterina.rios101.sprint.app.reset;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import es.ulpgc.caterina.rios101.sprint.ContadorActivity;
import es.ulpgc.caterina.rios101.sprint.ContadorState;
import es.ulpgc.caterina.rios101.sprint.app.AppMediator;

public class ResetRouter implements ResetContract.Router {

    public static String TAG = ResetRouter.class.getSimpleName();

    private AppMediator mediator;

    public ResetRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, ContadorActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(ResetState state) {
        mediator.setResetState(state);
    }

    @Override
    public ContadorState getDataFromPreviousScreen() {
        ContadorState state = mediator.getContadorState();
        return state;
    }
}
