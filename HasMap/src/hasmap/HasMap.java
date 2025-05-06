package hasmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HasMap {

    public static void main(String[] args) {

        HashMap<String, String> capitalCitis = new HashMap<>();
        capitalCitis.put("England", "London");

        System.out.println(capitalCitis);

        HashSet<String> cars = new HashSet<>();

        cars.add("Nissan");
        cars.add("volvo");
        cars.add("toyota");
        cars.add("jac");
        System.out.println(cars);

        Set<Integer> i = new HashSet<>();
        i.add(50);
        i.add(20);
        i.add(30);
        i.add(90);
        System.out.println(i);

        Map<Integer, String> StudentD = new HashMap<>();

        StudentD.put(11, "Rahmat");
        StudentD.put(22, "Parvez");
        StudentD.put(33, "Sathe");
        StudentD.put(44, "Rohim");
        StudentD.put(55, "Easin");
        StudentD.put(66, "Sadiar");
        StudentD.put(77, "Rakib");

        System.out.println(StudentD);

    }

}
