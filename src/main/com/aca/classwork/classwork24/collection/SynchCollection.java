package com.aca.classwork.classwork24.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class SynchCollection {
    public static void main(String[] args) {
//        List<Integer> sharedList = new Vector<>();
//        List<Integer> sharedList = Collections.synchronizedList(
//                new ArrayList<>()
//        );

        List<Integer> sharedList = new CopyOnWriteArrayList<>();//synchronized list a, i tarberutyun vectori, read i write i methodnery arandznacvac en

        ExecutorService executor2 = Executors.newFixedThreadPool(16);//cankacac pahi tuyl e talis aravelaguyny 16 thread ashxati
        //Executor Servicey tramadrum e service vory tramadrum e service vorov karoxenq hetevel te inch kpatahi objectneri het
/*
        List<Thread> threadList = new ArrayList<>();
*/

        List<Future<?>> futureList = new ArrayList<>();
        for (int i = 0; i < 150; i++) {

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 15; j++) {
                        sharedList.add(new Random().nextInt());
                    }
                }
            };
/*            Thread thread = new Thread(runnable);
            thread.start();
            threadList.add(thread);*/

//            executor2.execute(runnable);
//            executor2.submit(runnable);
           //1
            Future<?> future = executor2.submit(runnable);

            //callable y karox e veradarcnel ardyunq , ev karoxe gcel exception , i tarberutyun runnable i , da void er

            //2
            executor2.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    return null;
                }
            });
            futureList.add(future);
        }
                    //cuyc e talis vor menq el tasker chenq talis, arden petq e verjacni
        executor2.shutdown();

       /* threadList.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
*/        System.out.println(sharedList.size());


}
}