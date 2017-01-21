package Modules;

import java.util.HashMap;
import java.util.List;

/**
 * Created by bhavesh.kumar on 1/21/2017.
 */

public interface ResultsListener {
    public void onResultsSucceeded(List<HashMap<String, String>> list);
}
