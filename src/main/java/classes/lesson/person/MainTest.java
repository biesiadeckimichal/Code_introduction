package classes.lesson.person;

public class MainTest {
    public static void main(String[] args) {
        PersonTest tomaszNowak = new PersonTest("Tomasz", "Nowak", "ul.Stara 1", 1980, null, null);
        PersonTest annaNowak = new PersonTest("Anna", "Nowak", "ul.Nowa 1", 2000, null, tomaszNowak);


        System.out.println(tomaszNowak.getFirstName());
        System.out.println(tomaszNowak.getAddress());
        System.out.println();
        System.out.println(annaNowak.getFather());
        System.out.println();
        System.out.println("czy " + tomaszNowak.getFirstName() + " jest ojcem " + annaNowak.getFirstName() + " " + tomaszNowak.isParent(annaNowak));
        System.out.println();
        System.out.println("czy " + tomaszNowak.getFirstName() + " jest starszy od " + annaNowak.getFirstName() + " " + tomaszNowak.isOlderThan(annaNowak));
    }
}
