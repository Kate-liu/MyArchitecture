package org.copydays.rmliu.homework.component;

public class FrameComponent extends Container {

    public FrameComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print frame (%s)", this.name));
        super.print();
    }
}
