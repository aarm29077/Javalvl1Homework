package com.aca.classwork.classwork12.timer;

public class GoodTimer implements Timer{

    private Action action;

    public GoodTimer(Action action) {
        this.action = action;
    }

    @Override
    public void start(){
        while (true){
            wait1Second();
            action.doAction();

        }
    }
    private void wait1Second() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start <= 1000) {

        }
    }
}
