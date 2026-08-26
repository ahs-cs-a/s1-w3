public class ScoreMain {
    public static void main(String[] args) {
        Score s = new Score();
        Score s1 = new Score(20);

        s.add(2);
        s1.sub(2);

        s.print();
        s1.print();
    }
}
