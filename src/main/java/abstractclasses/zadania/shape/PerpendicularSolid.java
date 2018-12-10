package abstractclasses.zadania.shape;


public class PerpendicularSolid {
    private Rectangle bottom;
    private int h;

    public PerpendicularSolid(Rectangle bottom, int h) {
        this.bottom = bottom;
        this.h = h;
    }

    public Rectangle getBottom() {
        return bottom;
    }


    public int getSurfaceArea() {
        return 2 * (bottom.getArea() + bottom.getA() * h + bottom.getB() * h);
    }

    public int getVolume() {
        return bottom.getA() * bottom.getB() * h;
    };

}
