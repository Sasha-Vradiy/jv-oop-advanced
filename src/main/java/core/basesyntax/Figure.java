package core.basesyntax;

public abstract class Figure {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "color='" + color + '\'' +
                '}';
    }
}