public class RefillableMain {
    public static void main(String[] args) {
        Refillable r = new Refillable(25);
        r.addTo(10);
        r.useUp(5);
        System.out.println(r.amountCount());
    }
}
