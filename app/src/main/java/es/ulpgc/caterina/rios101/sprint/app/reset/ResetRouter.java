package es.ulpgc.caterina.rios101.sprint.app.reset;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

public class ResetRouter implements ResetContract.Router {

    public static String TAG = ResetRouter.class.getSimpleName();

    private AppMediator mediator;

    public ResetRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, ResetActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(ResetState state) {
        mediator.setResetState(state);
    }

    @Override
    public ResetState getDataFromPreviousScreen() {
        ResetState state = mediator.getResetState();
        return state;
    }
}
