package es.ulpgc.caterina.rios101.sprint.app.reset;

public class ResetModel implements ResetContract.Model {

    public static String TAG = ResetModel.class.getSimpleName();

    public ResetModel() {

    }

    @Override
    public String fetchData() {
        return "Hello";
    }
}
