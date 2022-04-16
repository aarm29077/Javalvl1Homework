package com.aca.homework.week12.temperature;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws IOException {
        List<DailyTemperature> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 365; i++) {
            DailyTemperature dailyTemperature = new DailyTemperature();
            dailyTemperature.setDayNumber(random.nextInt(365));
            dailyTemperature.setDegree(random.nextInt(25));
            list.add(dailyTemperature);
        }
        for (int i = 0; i < 365; i++) {
            DailyTemperatureFileItemWriter dailyTemperatureFileItemWriter = new DailyTemperatureFileItemWriter();
            dailyTemperatureFileItemWriter.write(list.get(i));
        }

//        list.forEach(new Consumer<DailyTemperature>() {
//            @Override
//            public void accept(DailyTemperature dailyTemperature) {
//                System.out.println(dailyTemperature);
//            }
//        });

        for (DailyTemperature dailyTemperature : list) {
            DailyTemperatureFileItemReader dailyTemperatureFileItemReader = new DailyTemperatureFileItemReader();
            dailyTemperatureFileItemReader.read(dailyTemperature);
        }


    }
}
