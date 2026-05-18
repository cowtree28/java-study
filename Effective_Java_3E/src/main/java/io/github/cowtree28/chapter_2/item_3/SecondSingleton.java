package io.github.cowtree28.chapter_2.item_3;

public class SecondSingleton {
    private static final SecondSingleton INSTANCE = new SecondSingleton();

    private SecondSingleton() {}

    public static SecondSingleton getInstance() {
        return INSTANCE;
    }
}
