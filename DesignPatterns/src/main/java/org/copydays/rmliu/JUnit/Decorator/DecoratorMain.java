package org.copydays.rmliu.JUnit.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        AnyThing t1 = new Moon(new Dream(new You(null)));
        t1.exe();
//        明月装饰了梦装饰了你

        AnyThing t2 = new Dream(new Moon(new You(null)));
        t2.exe();
//        梦装饰了明月装饰了你
    }
}
