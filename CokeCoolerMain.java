public class CokeCoolerMain{
    public static void main(String[] args) {
        CokeCooler c = new CokeCooler();
        CokeCooler c1 = new CokeCooler(20);

        c.add(2);
        c1.sub(2);

        c.print();
        c1.print();
    }
}