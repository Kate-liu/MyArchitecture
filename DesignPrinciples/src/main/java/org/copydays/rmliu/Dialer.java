package org.copydays.rmliu;

public class Dialer {
    public void enterDigit(int digit) {
        screen.display(digit);
        speeker.beep(digit);
    }

    public void dial() {
        screen.display("dialing...");
        radio.connect();
    }

    boolean ptFlag = false;
    boolean punchFlag = false;
    // remember to reset these flag

    void copy() {
        int c;
        while ((c = (ptFlag ? Rdpt() : RdKbd())) != EOF) {
            punchFlag ? WrtPunch(c) : WrtPrt(c);
        }
    }
}
