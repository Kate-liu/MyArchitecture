package org.copydays.rmliu.homework;

import org.copydays.rmliu.homework.component.*;

public class Main {
    public static void main(String[] args) {
        WinForm winForm = new WinForm("Window 窗口");

        winForm.addComponent(new PictureComponent("logo图片"));
        winForm.addComponent(new ButtonComponent("登录"));
        winForm.addComponent(new ButtonComponent("注册"));

        Container frame = new FrameComponent("frame1");
        frame.addComponent(new LableComponent("用户名"));
        frame.addComponent(new TextBoxComponent("文本框"));
        frame.addComponent(new LableComponent("密码"));
        frame.addComponent(new PasswordBoxComponent("密码框"));
        frame.addComponent(new CheckBoxComponent("复选框"));
        frame.addComponent(new TextBoxComponent("记住用户名"));
        frame.addComponent(new LinkLableComponent("记住密码"));
        winForm.addComponent(frame);

        winForm.print();
    }
}
