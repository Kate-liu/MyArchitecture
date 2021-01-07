package org.copydays.rmliu.homework.component;

public class WinForm extends Container {

    public WinForm(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print WinForm(%S)", this.name));
        super.print();
    }

}
