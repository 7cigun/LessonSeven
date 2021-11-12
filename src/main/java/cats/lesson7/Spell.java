package cats.lesson7;

public class Spell {
    public static String mouses(int appetite) {
        String mouse = switch (appetite) {
            case 1, 21 -> "мышь";
            case 2, 3, 4, 23, 24 -> "мыши";
            case 0, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 27, 28, 29, 30 -> "мышей";
            default -> throw new IllegalStateException("Unexpected value: " + appetite);
        };
        return mouse;
    }

}
