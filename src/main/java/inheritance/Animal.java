package inheritance;

public class Animal {
    private String specie;
    // w ten sposob sprawiamy ze to pole jest dostepne dla calego pakietu z lewej
    // modifikator protected powoduje ze pole jest dostepne w pakiecie oraz w dziedziczeniu
    protected int limbCount;
    private boolean dead;
    private int weight;



    public Animal (String specie, int limbCount, boolean dead, int weight) {
        this.specie = specie;
        this.limbCount = limbCount;
        this.dead = dead;
        this.weight = weight;
    }

    public String getSpecie() {
        return specie;
    }

    public int getLimbCount() {
        return limbCount;
    }

    public boolean isDead() {
        return dead;
    }

    // nadpisujemy systemowa metode toString, na swoj sposob


    @Override
    public String toString() {
        return "Animal{" +
                "specie='" + specie + '\'' +
                ", limbCount=" + limbCount +
                ", dead=" + dead +
                ", weight=" + weight +
                '}';
    }

    public static Animal getHeaviest(Animal[] animals) {
        Animal heaviestAnimal = animals[0];
        for (int i = 1; i < animals.length; i++) {
            if (animals[i].weight > heaviestAnimal.weight) {
                heaviestAnimal = animals[i];
            }
        } return heaviestAnimal;
    }



}
