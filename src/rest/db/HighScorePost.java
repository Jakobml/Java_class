package rest.db;

/**
 * Created by jane on 2016-01-10.
 */
public class HighScorePost implements Comparable<HighScorePost> {
    private String user;

    private long score;

    @Override
    public int compareTo(HighScorePost o) {
        if (this.score > o.getScore()) {
            return 1;
        } else if (this.score < o.getScore()) {
            return -1;
        }
        return 0;

        //return Long.compare(this.score, o.getScore());
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }
}
