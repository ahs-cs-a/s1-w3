public class CandyJar{
    private int numCandy;
    public CandyJar(){
        numCandy = 10;
    }

    public CandyJar(int a){
        numCandy = a;
    }

    public void eat(int nom){
        numCandy -= nom;
    }

    public void fill(int add){
        numCandy += add;
    }
    public void print(){
        System.out.println("number of candies: " + numCandy);
    }

    
}