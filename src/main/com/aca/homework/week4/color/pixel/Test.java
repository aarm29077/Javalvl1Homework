package main.com.aca.homework.week4.color.pixel;

public class Test {
    public static void main(String[] args) {
        ColorPrint colorPrint1 = new ColorPrint();
        colorPrint1.setColor("red");
        colorPrint1.setX(4);
        colorPrint1.setY(2);

        ColorPrint colorPrint2=new ColorPrint();
        colorPrint2.setColor("red");
        colorPrint2.setX(6);
        colorPrint2.setY(3);

        ColorPrint colorPrint3 = new ColorPrint();
        colorPrint3.setColor("blue");
        colorPrint3.setX(2);
        colorPrint3.setY(5);

        System.out.println(colorPrint1.getColor() + " " + colorPrint1.getX() + " " + colorPrint1.getY());

    }
}
