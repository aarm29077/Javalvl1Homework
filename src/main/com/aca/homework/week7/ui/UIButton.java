package main.com.aca.homework.week7.ui;

/*
Given the UIView class (user interface presentation component) that has width and height and click method.
The UIButton class is a UIView and has buttonColor field in addition to width and height fields.
The UIText class that is a UIView too, has text value, text color in addition to width and height fields.
When a user clicks on the UIButton the message 'clicked on a button having a color $buttonColor, width: $width, height: $height' should be printed.
When a user clicks on the UIText the message 'clicked on a text $text having a color $textColor, width: $width, height: $height' should be printed.

 */

public class UIButton extends UIView {
    private String buttonColor;


    public UIButton(long width, long height, String buttonColor) {
        super(width, height);
        this.buttonColor = buttonColor;
    }


    @Override
    public void click() {
        System.out.println("clicked on a button having a color " + buttonColor + this);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
