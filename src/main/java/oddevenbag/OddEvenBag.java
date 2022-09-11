// TODO implement this class and associated methods
package oddevenbag;

import java.util.ArrayList;
import java.util.List;

public class OddEvenBag{
    private List<Integer> cont;

    //Creators
    public OddEvenBag() {
        cont = new ArrayList<Integer>();
    }

    public OddEvenBag(int[] mem) {
        cont = new ArrayList<Integer>();
        for (int i = 0; i < mem.length; i++) {
            cont.add(mem[i]);
        }
    }

    //Mutators
    public void add(int new_mem) {
        cont.add(new_mem);
    }

    public void remove(int target) {
        for(int i =0; i < cont.size();i++){
            if(cont.get(i) == target)
            {
                cont.remove(i);
                return;
            }
        }
    }

    public void increment() {
        for (int i = 0; i < cont.size(); i++) {
            cont.set(i, cont.get(i) + 1);
        }
    }

    public void decrement() {
        for (int i = 0; i < cont.size(); i++) {
            cont.set(i, cont.get(i) - 1);
        }
    }

    //Observers
    public boolean contains(int x) {
        return cont.contains(x);
    }

    public int getCount(int x) {
        int count = 0;

        for (int i = 0; i < cont.size(); i++) {
            if (cont.get(i) == x) {
                count += 1;
            }
        }
        return count;
    }

    public long sum() {
        long sum = 0;

        for (int i = 0; i < cont.size(); i++) {
            sum += cont.get(i);
        }

        return sum;
    }

    public boolean equals(OddEvenBag bag2) {
        if (bag2.cont.size() != cont.size())
            return false;

        int odd1 = 0;
        int even1 = 0;
        int odd2 = 0;
        int even2 = 0;

        for (int i = 0; i < cont.size(); i++) {
            if (cont.get(i) % 2 == 0) {
                even1 += 1;
            } else {
                odd1 += 1;
            }

            if (bag2.cont.get(i) % 2 == 0) {
                even2 += 1;
            } else {
                odd2 += 1;
            }
        }
        return even1 == even2 && odd1 == odd2;
    }

    public int hashCode() {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < cont.size(); i++) {
            if (cont.get(i) % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        String hash = odd + "" + even;
        return Integer.parseInt(hash);
    }
}
