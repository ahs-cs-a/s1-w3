public class Score {
    private int Score;

    public Score(int S){
        Score = S;
    }

    public Score(){
        Score = 50;
    }

    public void increaseScore(int a){
        Score += a;
    }

    public void decreaseScore(int a){
        Score -= a;
    }

    public int ScoreCount(){
        return Score;
    }


}

