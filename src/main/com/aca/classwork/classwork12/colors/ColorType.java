package com.aca.classwork.classwork12.colors;

public enum ColorType {
    GREEN("green color", 0XFFFF0000),
    BLUE("blue color", 0XFFFF0000),
    RED("red color", 0XFF00FF00);

    private String colorStringRepresentation;
    private int intValue;

    ColorType(String colorStringRepresentation, int intValue) {
        this.colorStringRepresentation = colorStringRepresentation;
        this.intValue = intValue;
        System.out.println("The constructor was invoked " + colorStringRepresentation);
    }

    ColorType(String colorStringRepresentation) {
        this.colorStringRepresentation = colorStringRepresentation;
        this.intValue = 0;
        System.out.println("The constructor was invoked " + colorStringRepresentation);
    }

    public String getColorStringRepresentation() {
        return colorStringRepresentation;
    }

    public int getIntValue() {
        return intValue;
    }

    public static String getColor(ColorType colors) {
        if (colors == ColorType.GREEN) {
            return "green";
        }
        if (colors == ColorType.BLUE) {
            return "blue";
        }
        if (colors == ColorType.RED) {
            return "red";
        }
        return "default value";
    }

    @Override
    public String toString() {
        if (this == ColorType.RED) {
            return "red color";
        }
        if (this == ColorType.BLUE) {
            return "blue color";
        }
        if (this == ColorType.GREEN) {
            return "green color";
        }
        return "default value";
    }
}
