package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double areaCalculator() {
        return base * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + "square: "
                + areaCalculator() + " sq. units, color " + getColor()
                + " base " + base
                + "height " + height);
    }
}
