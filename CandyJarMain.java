public class CandyJarMain {
    public static void main(String[] args) {
        CandyJar c1 = new CandyJar(15);
        CandyJar c2 = new CandyJar(20);
        
        c1.eat(5);
        c2.eat(10);

        c1.refill(15);
        c2.refill(20);
        System.out.println("C1: ");
        c1.printState();
        
        System.out.println("C2: ");
        c2.printState();
    

    }
}