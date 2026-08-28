public class Refillable {
    private int amount;
    private int totalUsed;
    private int totalTimesUsedHappens; 

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

    public double averageUse(){
        return 1.0*totalUsed/totalTimesUsedHappens;
    }

    public int amountCount(){
        return amount;
    }
}


