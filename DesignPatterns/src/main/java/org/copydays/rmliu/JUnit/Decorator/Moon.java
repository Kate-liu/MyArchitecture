package org.copydays.rmliu.JUnit.Decorator;

public class Moon implements AnyThing {

    private AnyThing a;

    public Moon(AnyThing a) {
        this.a = a;
    }

    @Override
    public void exe() {
        System.out.print("明月装饰了");
        a.exe();
    }
}
