public class CandyJarMain{
    public static void main(String[] args) {
    CandyJar c = new CandyJar();
    CandyJar c1 = new CandyJar(507328967);

    c1.eat(50);
    c.fill(2);

    c.print();
    c1.print();
    }
}