public class Case4 {
    public static void main(String[] args) {
        String text = "alfabetz";
        char highest = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > highest) {
                highest = text.charAt(i);
            }
        }
        System.out.println(highest);
        int x = highest ;
        System.out.println(x);
    }
}
