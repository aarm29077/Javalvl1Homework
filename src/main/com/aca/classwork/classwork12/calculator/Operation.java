package com.aca.classwork.classwork12.calculator;

public enum Operation {
    SUBTRACTION {
        @Override
        public double calculate(double number1, double number2) {
            return number1 - number2;
        }
    },
    MULTIPLICATION {
        @Override
        public double calculate(double number1, double number2) {
            return number1 * number2;
        }
    },
    DIVISION {
        @Override
        public double calculate(double number1, double number2) {
            return number1 / number2;
        }
    },
    ADDITION {
        @Override
        public double calculate(double number1, double number2) {
            return number1 + number2;
        }
    };

    public abstract double calculate(double number1, double number2);

    public static void main(String[] args) {
        System.out.println(Operation.ADDITION.calculate(10, 50));
        System.out.println(Operation.DIVISION.calculate(80, 20));
    }
}
