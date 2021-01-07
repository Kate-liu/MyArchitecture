package org.copydays.rmliu.homework.component;

public class ButtonComponent extends Component {

    public ButtonComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print Button (%s)", this.name));
    }
}
