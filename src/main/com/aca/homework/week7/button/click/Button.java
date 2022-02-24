package main.com.aca.homework.week7.button.click;
/*
Create a Button class that has a text field and click() method.
Every time when click method is invoked, the application should print 'clicked on the button'.
Create an Action interface that has doAction() method.
Implement the click logic by passing an anonymous instance of the Action interface to the Button class.

ստեղծում եք նաև ButtonTest  class test folder-ի com.aca.homework.week7.button.click package-ում (ctrl+shift+T),  ստեղծում եք Button class- object, որին փոխանցում եք anonymous Action object.
Կանչում եք click method-ը
 */
public class Button implements Action{

    private String text;

    public String getText() {
        return text;
    }

    @Override
    public String click() {
        return text;
    }

    public Action doAction() {
        return new Button() {
            @Override
            public String click() {
                return "clicked on the button";
            }
        };
    }

}
