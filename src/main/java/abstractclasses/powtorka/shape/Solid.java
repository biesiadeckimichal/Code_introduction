package abstractclasses.powtorka.shape;

public abstract class Solid {
    private int h;
    private int r;

    public Solid(int h, int r) {
        this.h = h;
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public int getR() {
        return r;
    }

    public abstract int getSurfaceArea();
    public abstract int getVolume();

}
