package marta;

import java.util.Comparator;

public class SimEventComparator implements Comparator<SimEvent> {
    @Override
    public int compare(SimEvent x, SimEvent y) {
        if (y == null) {
            return -1;
        } else if (x == null) {
            return 1;
        } else {
            return x.getRank() - y.getRank();
        }
    }

}
