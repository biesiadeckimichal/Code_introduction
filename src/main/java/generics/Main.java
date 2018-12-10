package generics;

import interfaces.Cocaine;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("abs");
        System.out.println(stringBox.getElement());

        Integer myInteger = 5;

        Box<Integer> intBox = new Box<>(343);
        System.out.println(intBox.getElement());

        Box<Boolean> booleanBox = new Box<>(true);


    }
}
