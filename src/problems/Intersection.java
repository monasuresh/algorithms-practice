package problems;

import java.util.ArrayList;
import java.util.Collections;

public class Intersection {

    public static ArrayList<Integer> getIntersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1 == null || list2 == null || list1.size() == 0 || list2.size() == 0) {
            return null;
        }

        ArrayList<Integer> intersection = new ArrayList<>();

        Collections.sort(list1);
        Collections.sort(list2);

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                i++;
            } else if (list2.get(j) < list1.get(i)) {
                j++;
            } else {
                i++;
                j++;
                intersection.add(list1.get(i));
            }
        }

        return intersection;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        ArrayList<Integer> result = getIntersection(list1, list2);

        System.out.println(result);
    }
}
