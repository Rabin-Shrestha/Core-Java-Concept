package main.designPatterns.singletone;

public class LazySingletone {
    private static LazySingletone lazySingletone;

    public static LazySingletone getInstance() {
        if (lazySingletone == null)
            lazySingletone = new LazySingletone();
        return lazySingletone;
    }
}
