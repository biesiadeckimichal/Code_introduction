package abstractclasses.powtorka.shape;

public class Cylinder extends Solid {
    public Cylinder(int r, int h) {
        super(r, h);
    }

    public int getSurfaceArea() {
        return 2 * 314/100 * getR() * getR() + 2 * 314/100 * getR() * getH();
    }

    public int getVolume() {
        return 314/100 * getR() * getR() * getH();
    }


}
