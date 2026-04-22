package io.github.cowtree28.chapter_2.item_2;

public class Human {
    private final int age;
    private final String name;

    public static class Builder {
        private int age;
        private String name;

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }

    private Human(Builder builder) {
        age = builder.age;
        name = builder.name;
    }

    public String toString() {
        return "name = " + name + "\n" + "age = " + age;
    }
}
