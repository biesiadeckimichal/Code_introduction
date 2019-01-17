package collections.zadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise_1 {
    public static void main(String[] args) {
        List<String> color_list = new ArrayList<String>();
        color_list.add("red");
        color_list.add("green");
        color_list.add("yellow");


        System.out.println(color_list);

        color_list.add(0,"new color");

        for (String element: color_list) {
            System.out.println(element);
        }

        System.out.println();

        String element_0 = color_list.get(0);
        System.out.println(element_0);

        color_list.set(2,"pink");

        System.out.println(color_list);

        color_list.remove(0);

        System.out.println(color_list);

        String searched_element = "yellow";

        System.out.println(color_list.contains(searched_element));

        Collections.sort(color_list);

        System.out.println(color_list);

        List<String> number_list = new ArrayList<String>();
        number_list.add("1");
        number_list.add("2");
        number_list.add("3");

        System.out.println("9");

        Collections.copy(color_list, number_list);
        System.out.println(number_list);

//        Collections.shuffle(color_list);
//        System.out.println(color_list);*/

        Collections.reverse(color_list);
        System.out.println(color_list);

        List<String> sub_color_list = color_list.subList(0, 2);
        System.out.println(sub_color_list);

        List<String> c1 = new ArrayList<String>();
        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.add("4");
        c1.add("5");

        List<String> c2 = new ArrayList<String>();
        c2.add("one");
        c2.add("two");
        c2.add("3");
        c2.add("4");
        c2.add("6");

        List<String> c3 = new ArrayList<String>();
        for (String e: c1) {
            c3.add(c2.contains(e) ? "yes" : "no");
        }
        System.out.println(c3);

        Collections.swap(c1, 1,3);
        System.out.println(c1);

        System.out.println(c1.size());


        List c4 = new ArrayList();

        for (int i = 0; i < c1.size() - 1; i++) {
            c4.add(i, c2.get(i));
        }

        System.out.println(c4);

        c4.addAll(c1);
        System.out.println(c4);





    }

}
