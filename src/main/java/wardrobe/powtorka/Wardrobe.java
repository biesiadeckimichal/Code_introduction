package wardrobe.powtorka;

public class Wardrobe {
    private Clothing[] clothes;

    public Wardrobe() {
        this.clothes = new Clothing[0];
    }

    public Wardrobe(Clothing[] clothes) {
        this.clothes = new Clothing[clothes.length];
        for (int i = 0; i < clothes.length; i++) {
            this.clothes[i] = clothes[i];
        }
    }

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

    public void remove(int index) {
        Clothing[] newClothes = new Clothing[clothes.length - 1];
        for (int i = 0; i < index - 1; i++) {
            newClothes[i] = clothes[i];
        }
        for (int i = index; i < clothes.length; i++) {
            newClothes[i - 1] = clothes[i];
        }
        clothes = newClothes;
    }

    public Clothing get(int index) {
        return clothes[index - 1];
    }

    public Wardrobe getBySize(int size) {
        Wardrobe wardrobe = new Wardrobe();
        for (Clothing element: clothes) {
            if (element.getSize() == size) {
                wardrobe.add(element);
            }
        }
        return wardrobe;
    }

    // public void removeByName(Clothing clothingToBeRemoved) {
    //     int clothingCount = 0;
    //     for (Clothing element: clothes) {
    //         if (element == clothingToBeRemoved) {
    //             clothingCount++;
    //         }
    //     }
    //     Clothing[] newClothes = new Clothing[clothes.length - clothingCount];
    //     int indexShift = 0;
    //     for (int i = 0; i < clothes.length; i++) {
    //         if (clothes[i] == clothingToBeRemoved) {
    //             indexShift++;
    //         } else {
    //             newClothes[i] = clothes[i - indexShift];
    //         }
    //     }
    //     clothes = newClothes;
    // }
}
