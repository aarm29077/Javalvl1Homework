package com.aca.classwork.classwork25.iterrupt;

public class InterruptMain {
    public static void main(String[] args) throws InterruptedException {
        final Thread thread = new Thread(() -> {
            try {
//                Thread.sleep(10_000);
                Thread.sleep(5_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            doHeavyTasks();
            System.out.println("Finished");
        });
        thread.start();

        new Thread(() -> {
            try {
//                Thread.sleep(2000);
                Thread.sleep(6_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread.interrupt();
        }).start();
    }

    public static void doHeavyTasks() {
        for (int i = 0; i < 100; i++) {

            if (Thread.interrupted()) {
                return;
            }//ete ify chgreinq interrupty cher ashxati.


            System.out.println("Doing a heavy task ... " + i);
            try {
                Thread.sleep(100);//0.1varkyan => 10 hat kpti u interrupt kani(qani vor tveleinq 6varkyan heto, ashxatanqy 5varkyanum kprcni ev en mi varkyanum khascni ani 10 hat doHeavy method, u nor interrupt kani )
            } catch (InterruptedException e) {
//                e.printStackTrace();
                return;
            }
        }
    }
}
