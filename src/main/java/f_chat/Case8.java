package f_chat;

//litera z największą ilością wystąpień//

public class Case8 {
    public static void main(String[] args) {
        String text = "aaabbbbbsd";
        int occ = 0;
        int highest = 0;
        int numberOfA = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i < text.length() - 1) {
                if (text.charAt(i) == text.charAt(i + 1)) {
                    occ += 1;
                    System.out.println(text.charAt(i));
                }
            }
        }
        System.out.println(occ);
    }
}
