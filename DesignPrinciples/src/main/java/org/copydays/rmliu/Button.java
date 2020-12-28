package org.copydays.rmliu;

import java.util.LinkedList;
import java.util.List;

public class Button {
    private List<ButtonListener> listeners;

    public Button() {
        this.listeners = new LinkedList<ButtonListener>();
    }

    public void addListener(ButtonListener listener) {
        assert listener != null;
        listeners.add(listener);
    }

    public void press() {
        for (ButtonListener listener : listeners) {
            listener.buttonPressed();
        }
    }
}
