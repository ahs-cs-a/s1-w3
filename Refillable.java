public class Refillable {
    private int amount;
    private int totaluse;
    private int totaluseinstances;
    private int purple;
    public Refillable(){
        amount =10;
    }

    public Refillable(int a){
        amount = a;
    }

    public void change(int b){
        amount += b;
    }

    public void averageuse(){
        purple = totaluse / totaluseinstances;
    }

    public void print(){
        System.out.println("Amount: " + amount);
    }
}
