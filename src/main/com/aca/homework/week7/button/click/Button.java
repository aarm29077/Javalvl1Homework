package main.com.aca.homework.week7.button.click;

public class Button {
    Action action;
    private String text;

    public Button(Action action) {
        this.action = action;
        this.text = "clicked on the button";
    }

    public void click() {
        System.out.println(action.doAction(text));
    }


}
