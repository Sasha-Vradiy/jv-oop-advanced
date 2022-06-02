package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    public String getRandomColor() {
        int randomColor = random.nextInt(Color.values().length);
        return Color.values()[randomColor].name();
    }
}