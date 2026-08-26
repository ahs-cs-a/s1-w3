public class CokeCooler {
    private int num;
    public CokeCooler(){
        num = 100;
    }

    public CokeCooler(int a){
        num = a;
    }

    public void add(int b){
        num += b;
    }

    public void sub(int c){
        num -= c;
    }

    public void print(){
        System.out.println("Number of Cokes: " + num);
    }
}
