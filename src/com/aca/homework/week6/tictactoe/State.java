package com.aca.homework.week6.tictactoe;

public enum State {
    EMPTY,
    X,
    O;

    @Override
    public String toString() {
        if (this == EMPTY) {
            return "*";
        } else if (this == X) {
            return "X";
        } else if (this == O) {
            return "O";
        }
        return "Error";
    }
}
