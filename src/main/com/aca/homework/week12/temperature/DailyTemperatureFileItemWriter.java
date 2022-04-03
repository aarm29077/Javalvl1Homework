package com.aca.homework.week12.temperature;

import java.io.*;

public class DailyTemperatureFileItemWriter implements ItemWrite<DailyTemperature> {
    final String filename = "C:\\Users\\User\\IdeaProjects\\Javalvl1firstproject\\src\\main\\com\\aca\\homework\\week12\\temperature\\daily-temp-data.txt";


    @Override
    public void write(DailyTemperature item) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(
                filename
        );
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                fileOutputStream
        );
//        BufferedWriter line = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

        objectOutputStream.writeChars(""+item.getDayNumber());
        objectOutputStream.writeChars(""+item.getDegree());

//        line.newLine();

        objectOutputStream.close();
        fileOutputStream.close();
    }
}