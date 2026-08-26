public class CokeCooler {
    private int amount;

    public CokeCooler(int C){
        amount = C;
    }

    public CokeCooler(){
        amount = 100;
    }

    public void drink(int amt){
        amount -= amt;
    }

    public void refill(int amt){
        amount += amt;
    }

    public int cokeCount(){
        return amount;
    }

    public void printState(){
        System.out.println("Num of Cokes: " + amount);
    }
}
