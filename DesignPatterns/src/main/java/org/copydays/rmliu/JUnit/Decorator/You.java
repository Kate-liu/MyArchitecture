package org.copydays.rmliu.JUnit.Decorator;

public class You implements AnyThing{
    private AnyThing a;

    public You(AnyThing a) {
        this.a = a;
    }

    @Override
    public void exe() {
        System.out.print("你\n");
    }
}
