package com.aca.homework.week5.abstractphone;

import java.util.Objects;

public class Phone {
    String imei;
    Model model;


    @Override
    public String toString() {
        return "Phone{" +
                "imei='" + imei + '\'' +
                ", model=" + model.modelType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(imei, phone.imei) && Objects.equals(model, phone.model);
    }

}
