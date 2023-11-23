package school.lesson10;

public class BoxFiller {
    public static void fillBoxWithApples(Box<Apple> appleBox, int numOfApples) {
        for(int i = 0; i < numOfApples; i++) {
            appleBox.addFruit(new Apple());
        }
    }

    public static void fillBoxWithOranges(Box<Orange> orangeBox, int numOfOranges) {
        for(int i = 0; i < numOfOranges; i++) {
            orangeBox.addFruit(new Orange());
        }
    }
}
