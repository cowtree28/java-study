package io.github.cowtree28.chapter_2.item_1;


public class StaticFactoryMethod {

    private static StaticFactoryMethod good1;
    private static StaticFactoryMethod bad2;

    private static A a_good1;
    private static A a_bad2;

    static {
        good1 = new StaticFactoryMethod();
        good1.a = 1;
        good1.b = "good";

        bad2 = new StaticFactoryMethod();
        bad2.a = 2;
        bad2.b = "bad";

        a_good1 = new A();
        a_good1.x = 1;
        a_good1.s = "good";

        a_bad2 = new A();
        a_bad2.x = 2;
        a_bad2.s = "bad";
    }
    int a;
    String b;

    public static StaticFactoryMethod from(A a) {
        StaticFactoryMethod m = new StaticFactoryMethod();
        m.a = a.x;
        m.b = a.s;

        return m;
    }

    public static StaticFactoryMethod of(int x, String s) {
        StaticFactoryMethod m = new StaticFactoryMethod();
        m.a = x;
        m.b = s;
        return m;
    }

    public static StaticFactoryMethod instance(StaticSetting s) {
        if (s == StaticSetting.GOOD_1) {
            return good1;
        }
        if (s == StaticSetting.BAD_2) {
            return bad2;
        }
        else {
            return null;
        }
    }

    public static StaticFactoryMethod getInstance(StaticSetting s) {
        return instance(s);
    }

    public static StaticFactoryMethod create(StaticSetting s) {
        StaticFactoryMethod m = new StaticFactoryMethod();
        if (s == StaticSetting.GOOD_1) {
            m.a = 1;
            m.b = "good";
        }
        if (s == StaticSetting.BAD_2) {
            m.a = 2;
            m.b = "bad";
        }
        return m;
    }

    public static StaticFactoryMethod newInstance(StaticSetting s) {
        return create(s);
    }

    public static A getType(StaticSetting s) {
        if (s == StaticSetting.GOOD_1) {
            return a_good1;
        }
        if (s == StaticSetting.BAD_2) {
            return a_bad2;
        }
        return null;
    }

    public static A newType(StaticSetting s) {
        A a = new A();
        if (s == StaticSetting.GOOD_1) {
            a.x = 1;
            a.s = "good";
        }
        if (s == StaticSetting.BAD_2) {
            a.x = 2;
            a.s = "bad";
        }
        return a;
    }

}
