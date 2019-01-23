package chat.powtórka;

public class Case6 {
    public static void main(String[] args) {
        String text = "kajak";
        boolean isPalindrome = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome == true) {
            System.out.println(text + " jest palindromem");
        } else {
            System.out.println(text + " nie jest palindromem");
        }
    }
}
