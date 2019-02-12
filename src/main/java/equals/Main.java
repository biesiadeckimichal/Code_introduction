package equals;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Chair chair1 = new Chair("adde", "ikea", 2016);
        Chair chair2 = new Chair("adde", "ikea", 2015);
        Chair chair3 = new Chair("adde", "ikea", 2016);

        System.out.println(chair1.equals(chair2));
        System.out.println(chair1.equals(chair3));

    }
}
