package com.aca.classwork.classwork9.vehicle;

public class SafeVehicle {
    private VehicleType type;
//    private String type;
    private int year;

    public SafeVehicle(VehicleType type, int year) {
//        if (type==VehicleType.BUS)//equals chenq anum, vorovhetev heapum mihat e enum sarqvac
        this.type = type;
//        this.type=type.name();//nuyn toString i dern e katarum ete toStringy override chenq arel
        this.year = year;
    }

    public static void main(String[] args) {
        SafeVehicle safeVehicle1=new SafeVehicle(VehicleType.BUS,2022);
        SafeVehicle safeVehicle2=new SafeVehicle(VehicleType.CAR,2019);
        SafeVehicle safeVehicle3=new SafeVehicle(null,2019);


        System.out.println(safeVehicle1.type);
    }
}
