package exceptions.powtorka;

public class Main {
    public static void main(String[] args) {
        PersonList myPersonList = new PersonList();
        try {
            myPersonList.add(new Person(39, "Filip", "Lisiakiewicz", 170, ""));
            myPersonList.add(new Person(34, "Agent", "Lisiakiewicz", 170, ""));
            myPersonList.add(new Person(21, "Bubel", "Lisiakiewicz", 170, ""));
            myPersonList.add(new Person(11, "Filip", "Kiszka", 170, ""));
            myPersonList.add(new Person(21, "Filip", "Kiszka", 170, ""));
            System.out.println(myPersonList.getPersonsByAge(21));
        } catch (IncorrectAgeException e) {
            e.getMessage();
        }

        try {
            System.out.println(myPersonList.FindPerson("Adam", "Lisiakiewicz").toString());
        } catch (NoSuchPersonException e) {
            System.out.println(e.getMessage() + " " + e.getName() + " " + e.getSurname());
        }
    }
}
