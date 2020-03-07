
import java.util.ArrayList;

public class Purse {
    private ArrayList coins;

    public Purse() {
        coins = new ArrayList();
    }

    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    public double getTotal() {
        double sum = 0;

        for (int i = 0; i < coins.size(); i++) {
            Coin c = (Coin) coins.get(i);
            sum += c.getValue();

        }
        return sum;
    }

    public int count(Coin aCoin) {
        int matches = 0;

        for (int i = 0; i < coins.size(); i++) {
            Coin c = (Coin) coins.get(i);

            if (aCoin.getName().equals(c.getName()) && aCoin.getValue() == c.getValue()){
                matches++;
            }
        }

        return matches;
    }
    public String findSmallest(){
        Coin min = (Coin) coins.get(0);
        double minVal = min.getValue();

        for (int i = 0; i < coins.size(); i++) {
            Coin comp = (Coin) coins.get(i);
            if (comp.getValue() < minVal){
                min = comp;
                minVal = comp.getValue();
            }
        }

        return min.getName();
    }
}


