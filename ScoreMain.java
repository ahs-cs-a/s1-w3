public class ScoreMain {
    public static void main(String[] args) {
        Score s = new Score();
        System.out.println(s.ScoreCount());

        Score s2 = new Score(15);
        s2.increaseScore(100);
        s2.decreaseScore(50);
        System.out.println("Should be 65 ::" + s2.ScoreCount());
    }
}
