package io.github.cowtree28.chapter_2.item_2;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human.Builder()
            .name("Nam Woo Hyun")
            .age(20)
            .build();

        System.out.println(human.toString());
    }
}
