package abstractclasses.zadania.shape;

public class Cone extends Solid {
    private int l;

    public Cone(int h, int r, int l) {
        super(h, r);
        this.l = l;
    }

    @Override
    public int getSurfaceArea() {
        int Pp = 314/100 * getR() * getR();
        int Pb = 314/100 * getR() * l;
        return  Pp + Pb;
    }

    @Override
    public int getVolume() {
        return 314 * (getR() * getR() * getH())/300;
    }

}
