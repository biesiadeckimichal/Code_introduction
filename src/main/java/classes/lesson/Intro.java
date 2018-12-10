package classes.lesson;

public class Intro {
    public static void main(String[] args) {
        // za kazdym razem gdy powstaje nowy obiekt uzywamy slowa new
        Cat myCat = new Cat();
        myCat.age = 8;
        myCat.breed = "syjamski";
        myCat.dead = false;
        myCat.name = "Stefan";

        System.out.println("imie I kota: " + myCat.name);

        // piszac w ten sposob obydwa koty przypisuje do tego samego kota, brakuje
        // slowa new
        Cat myCat2 = myCat;
        myCat2.name = "Elvis";

        System.out.println("imie I kota: " + myCat.name);
        System.out.println("imie II kota: " + myCat2.name);

        Cat myCat3 = new Cat("Zosia");
        System.out.println("imie III kota: " + myCat3.name);

        Cat myCat4 = new Cat("pusia","dachowiec", 4, false);

        System.out.println(myCat4.toString());

        myCat4.kill();
        System.out.println(myCat4);
        System.out.println("czy pusia jest stara: " + myCat4.isOld());
    }
}
