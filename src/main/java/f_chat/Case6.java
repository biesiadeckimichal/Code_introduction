package f_chat;

// czy slowo jest palindromem

public class Case6 {
    public static void main(String[] args) {
        String text = "kajak";
    // mozna dodac zmienna last char
    // int lastChar = text.length() - 1;
        int isPalindrome = 1;
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) != text.charAt(text.length() - 1 - i))) {
                isPalindrome = 0;
            }
        }
        if (isPalindrome == 1) {
            System.out.println(text + " jest palindromem");
        } else  {
            System.out.println(text + " nie jest palindromem");
        }
    }
}
