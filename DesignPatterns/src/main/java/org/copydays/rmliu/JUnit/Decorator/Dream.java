package org.copydays.rmliu.JUnit.Decorator;

public class Dream implements AnyThing {
    private AnyThing a;

    public Dream(AnyThing a) {
        this.a = a;
    }

    @Override
    public void exe() {
        System.out.print("梦装饰了");
        a.exe();
    }
}
