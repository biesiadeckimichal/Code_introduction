package if_loop;

public class Intro {
    public static void main (String[] args){
        int a = 77;
        int b = 42;
        int c = 77;

        if (a > b) {
            if (a > c) {
                System.out.println(a + " jest najwieksze");
            } else  {
                System.out.println(c + " jest najwieksze");
            }
        } else {
            if (b > c) {
                System.out.println(b + " jest najwieksze");
            } else {
                System.out.println(c + " jest najwieksze");
            }
        }

        int x = 1;

        // Instrukcja warunkowa if służy do wywoływania bloku kodu tylko w przypadku spełnienia zadanego warunku.
        if(x > 5) {
            // Ta partia kodu zostanie wywołana tylko jeśli x jest większy od 5.
            System.out.println("x jest większe od 5");
        } else {
            // Jeśli chcemy wywołać kod w przypadk niespełnienia warunku, możemy
            // dodać blok else.
            System.out.println("x nie jest większe od 5");
        }
    }
}
