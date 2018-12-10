package wardrobe;

public class Wardrobe {
    // Elementy szafy, to będą ubrania. Zawartość szafy będzie prechowywana w tablicy
    // ubrań.
    // Reszta (poza metodą getBySize) jest w pełni analogiczna do klasy IntList.
    // Jest to po prostu konterner obiektów typu Clothing.
    // tworzymy tablice intow ktora bedziemy uzywali jako obiektu - bim
    private Clothing[] clothes;

    // ten konstruktor tworzy pusta szafe, ktora musimy miec jako punkt
    // startowy, musi byc aby wypelnic szafe ciuchami
    public Wardrobe() {
        clothes = new Clothing[0];
    }

    // konstruktor
    // przypisuje wartosc parametru Clothing[] clothes polu obiektu clothes tak
    // aby to przechowac
    public Wardrobe(Clothing[] clothes) {
        this.clothes = new Clothing[clothes.length];
        for (int i = 0; i < clothes.length; i++) {
            this.clothes[i] = clothes[i];
        }
    }

    // metoda do wyswietlania intow
    // przez to ze jest tu public odwolujemy sie do konkretnego obiektu
    public void print() {
        for (int i = 0; i < clothes.length; i++) {
            System.out.println((i + 1) + ". " + clothes[i]);
        }
    }

    public void add(Clothing element) {
        Clothing[] newClothes = new Clothing[clothes.length + 1];
        for (int i = 0; i < clothes.length; i++) {
            newClothes[i] = clothes[i];
        }
        newClothes[clothes.length] = element;
        clothes = newClothes;
    }

    // shift + f6 refactor, lub ctr + r
    // ctrl + shift + f6 zmiana typow
    public void remove(int index) {
        Clothing[] newClothes = new Clothing[clothes.length - 1];
        for (int i = 0; i < index; i++) {
            newClothes[i] = clothes[i];
        }
        for (int i = index + 1; i < clothes.length; i++) {
            newClothes[i - 1] = clothes[i];
        }
        clothes = newClothes;
    }

    public Clothing get(int index) {
        return clothes[index];
    }

    public void removeByValue(Clothing clothingToBeRemoved) {
        int clothingCount = 0;
        for (Clothing clothing : clothes) {
            if (clothing == clothingToBeRemoved) {
                clothingCount++;
            }
        }
        Clothing[] newClothes = new Clothing[clothes.length - clothingCount];
        int indexShift = 0;
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] == clothingToBeRemoved) {
                indexShift++;
            } else {
                newClothes[i] = clothes[i - indexShift];
            }
        }
        clothes = newClothes;
    }

    // Metoda zwraca szafę zawierającą ubrania o zadanym rozmiarze (wybrane z szafy, dla której wywołano metodę)
    public Wardrobe getBySize(int size) {
        // Tworzymy pustą szafę
        Wardrobe wardrobe = new Wardrobe();
        // Do której dodamy wszystkie ubrania z szafy dla której wywołano metodę
        for (Clothing clothing : clothes) {
            // które są rozmiaru takiego, jak przekazano
            if (clothing.getSize() == size) {
                wardrobe.add(clothing);
            }
        }
        // zwracamy wypełnioną szafę.
        return wardrobe;
    }
}

