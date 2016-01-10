package rest.db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jane on 2016-01-10.
 */
public class Database {
    private static Database instance = null;

    private Database(){
        this.highScoreList = new HighScoreList();
    }

    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    private HighScoreList highScoreList;

    public List<HighScorePost> saveHighScore(int level, HighScorePost highScorePost){


        List<HighScorePost> highScores;
        if(this.highScoreList.getHighScorePosts().containsKey(level)){
            highScores = this.highScoreList.getHighScorePosts().get(level);
        }else{
            highScores = new ArrayList<>();
        }
        highScores.add(highScorePost);
        this.highScoreList.getHighScorePosts().put(level, highScores);
        return highScores;
    }

    public List<HighScorePost> getHighScore(int level, int numberOfPosts){
        List<HighScorePost> highScores = this.highScoreList.getHighScorePosts().get(level);
        if(highScores == null){
            return new ArrayList<>();
        }
        Collections.sort(highScores);
        if(highScores.size()<= numberOfPosts){
            return highScores;
        }

        return highScores.subList(0, numberOfPosts);
    }
}
