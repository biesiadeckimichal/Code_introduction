package abstractclasses.zadania.shape;

public class Cylinder extends Solid {
    public Cylinder(int h, int r) {
        super(h, r);
    }

    @Override
    public int getSurfaceArea() {
        return 2 * 314/100 * getR() * getR() + 2 * 314/100 * getR() * getH();
    }

    @Override
    public int getVolume() {
        return 314/100 * getR() * getR() * getH();
    };


}
