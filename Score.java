public class Score {
    private int num;
    public Score(){
        num = 50;
    }

    public Score(int a){
        num = a;
    }

    public void add(int b){
        num += b;
    }

    public void sub(int c){
        num -= c;
    }

    public void print(){
        System.out.println("Score: " + num);
    }
}
