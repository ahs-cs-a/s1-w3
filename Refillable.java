public class Refillable {
    private int amount;
    public Refillable(){
        amount =10;
    }

    public Refillable(int a){
        amount = a;
    }

    public void change(int b){
        amount += b;
    }

    public void print(){
        System.out.println("Amount: " + amount);
    }
}
