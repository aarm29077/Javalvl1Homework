package main.com.aca.homework.week5.abstractphone;


public abstract class AbstractPhoneService {


    public abstract Phone PhoneCreate(String imei, Model model);

    public abstract Phone PhoneGetByImei(String imei);

}
