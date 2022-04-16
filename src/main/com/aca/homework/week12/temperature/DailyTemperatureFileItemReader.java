package com.aca.homework.week12.temperature;

public class DailyTemperatureFileItemReader implements ItemReader<DailyTemperature> {
    @Override
    public void read(DailyTemperature item) {
        System.out.println(item);
    }
}
