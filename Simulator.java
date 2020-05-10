package mathcomp.oletsky.bayes;

import java.util.ArrayList;
import java.util.Random;

public class Simulator {
    public static ArrayList<ArrayList<String>> generateXYSet(
            int n,
            double pX,
            double pYX,
            double pYnotX
    ) {
        ArrayList<ArrayList<String>> res= new ArrayList<>();
        Random r = new Random();
        for (int i=1; i<=n; i++) {
            ArrayList<String> list = new ArrayList<>();
            res.add(list);
            if (r.nextDouble()<=pX) {
                list.add("1");
                if (r.nextDouble()<=pYX) list.add("1"); else list.add("0");
            }

            else {
                list.add("0");
                if (r.nextDouble()<=pYnotX) list.add("1"); else list.add("0");
            }

        }
        return res;
    }
}
