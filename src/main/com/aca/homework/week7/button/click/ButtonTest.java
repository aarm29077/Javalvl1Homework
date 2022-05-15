package com.aca.homework.week7.button.click;

class ButtonTest {
    public static void main(String[] args) {
        Button button = new Button(new Action() {
            @Override
            public String doAction(String text) {
                return text;
            }
        });
        button.click();
    }
}