package main.com.aca.homework.week5.abstractphone;

public class PhoneService extends AbstractPhoneService {
    private int index;

     Phone[] array ;

    @Override
    public Phone PhoneCreate(String imei, Model model) {
        Phone phone = new Phone();
        phone.setImei(imei);
        phone.model=model;
        this.array[index] = phone;
        ++index;

        return phone;
    }

    @Override
    public Phone PhoneGetByImei(String imei) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getImei().equals(imei)) {
                return array[i];
            }
        }
        return null;
    }


}
