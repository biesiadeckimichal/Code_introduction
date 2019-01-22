package abstractclasses.powtorka.shape;

public class Cone extends Solid {
    public Cone (int h, int r) {
        super(h, r);
    }

    public int getSurfaceArea() {
        int Pp = 314/100 * getR() * getR();
        int Pb = 314/100 * getR() * 1;
        return  Pp + Pb;
    }

    public int getVolume() {
        return 314 * (getR() * getR() * getH())/300;
    }


}
