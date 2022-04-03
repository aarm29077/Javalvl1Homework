package com.aca.homework.week12.temperature;

public class DailyTemperature {

    private int dayNumber;
    private double degree;

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

//    @Override
//    public void read() throws IOException {
//        ObjectInputStream objectInputStream = new ObjectInputStream(
//                new FileInputStream(filename)
//        );
//        System.out.println(objectInputStream.readInt());
//        System.out.println(objectInputStream.readDouble());
//        objectInputStream.close();
//    }
//
//
//    @Override
//    public void write() throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream(
//                filename
//        );
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                fileOutputStream
//        );
//        BufferedWriter line = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
//
//        objectOutputStream.writeInt(getDayNumber());
//        objectOutputStream.writeDouble(getDegree());
//        line.newLine();
//
//        objectOutputStream.close();
//        fileOutputStream.close();
//    }


    @Override
    public String toString() {
        return "dayNumber=" + dayNumber + ", degree=" + degree;
    }
}
