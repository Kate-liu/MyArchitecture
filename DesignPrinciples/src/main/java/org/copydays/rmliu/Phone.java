package org.copydays.rmliu;

public class Phone {
    private Dialer dialer;
    private Button[] digitButtons;
    private Button sendButton;

    public Phone() {  // 初始化
        dialer = new Dialer();
        digitButtons = new Button[10];  // 数字按钮

        for (int i = 0; i < digitButtons.length; i++) {
            digitButtons[i] = new Button();

            final int digit = i;

            digitButtons[i].addListener(new ButtonListener() {

                @Override
                public void buttonPressed() {
                    dialer.enterDigit(digit);
                }
            });
        }

        sendButton = new Button();  // 发送按钮
        sendButton.addListener(new ButtonListener() {

            @Override
            public void buttonPressed() {
                dialer.dial();
            }
        });
    }

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.digitButtons[9].press();
        phone.digitButtons[1].press();
        phone.digitButtons[1].press();

        phone.sendButton.press();

    }

}
