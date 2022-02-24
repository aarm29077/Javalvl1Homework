package main.com.aca.homework.week7.ui;

/*
Given the UIView class (user interface presentation component) that has width and height and click method.
The UIButton class is a UIView and has buttonColor field in addition to width and height fields.
The UIText class that is a UIView too, has text value, text color in addition to width and height fields.
When a user clicks on the UIButton the message 'clicked on a button having a color $buttonColor, width: $width, height: $height' should be printed.
When a user clicks on the UIText the message 'clicked on a text $text having a color $textColor, width: $width, height: $height' should be printed.

 */
public class UIView {

    private long width;
    private long height;

    public UIView(long width, long height) {
        this.width = width;
        this.height = height;
    }

    public void click() {

    }

    @Override
    public String toString() {
        return ", width: " + width + ", height: " + height;
    }
}
