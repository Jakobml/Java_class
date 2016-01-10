package rest.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jane on 2016-01-10.
 */
public class HighScoreList {
    private Map<Integer, List<HighScorePost>> highScorePosts = new HashMap<>();

    public Map<Integer, List<HighScorePost>> getHighScorePosts() {
        return highScorePosts;
    }

    public void setHighScorePosts(Map<Integer, List<HighScorePost>> highScorePosts) {
        this.highScorePosts = highScorePosts;
    }
}
