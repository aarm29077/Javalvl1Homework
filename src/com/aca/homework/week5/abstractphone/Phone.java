package com.aca.homework.week5.abstractphone;

import java.util.Objects;

public class Phone {
    private String imei;
    Model model;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "imei='" + getImei() + '\'' +
                ", model=" + model +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return this.getImei().equals(((Phone) o).imei) && this.model.equals(((Phone) o).model);
    }

}
