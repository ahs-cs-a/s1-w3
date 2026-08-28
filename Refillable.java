public class Refillable {
    private int amount;

    public Refillable(int amt){
        amount = amt;
    }

    public Refillable(){
        amount = 10;
    }

    public void useUp(int amt){
        amount -= amt;
    }

    public void addTo(int amt){
        amount += amt;
    }

    public int amountCount(){
        return amount;
    }
}


