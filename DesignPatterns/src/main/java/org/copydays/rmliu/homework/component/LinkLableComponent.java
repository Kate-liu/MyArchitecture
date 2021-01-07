package org.copydays.rmliu.homework.component;

public class LinkLableComponent extends Component {

    public LinkLableComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print LinkLable(%S)", this.name));
    }
}
