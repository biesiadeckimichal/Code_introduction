package b_if_loop;

public class Case2 {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 4, d = 333;

        if (a > b) { // b odpada, a top
            if (a > c) { // c odpada, a top
                if (a > d) { // d odpada, a top
                    System.out.println(a + " jest najwieksze");
                } else { // a odpada, d top
                    System.out.println(d + " jest najwieksze");
                }
            } else { // a odpada, c top
                if (c > d) { // d odpada, c top
                    System.out.println(c + " jest najwieksze");
                } else { // c odpada, d top
                    System.out.println(d + " jest najwieksze");
                }
            }
        } else { // a odpada
            if (b > c) { // c odpada, b top
                if (b > d) { // d odpada, b top
                    System.out.println(b + " jest najwieksze");
                } else { // b odpada, d top
                    System.out.println(d + " jest najwieksze");
                }
            } else  { // b odpada, c top
                if (c > d) { // d odpada, c top
                    System.out.println(c + " jest najwieksze");
                } else { // c odpada, d top
                    System.out.println(d + " jest najwieksze");
                }
            }
        }
    }
}
