package com.aca.homework.week7.tax;

/*
* There are 2 type of cars: ELECTRIC and HYBRID.
The annual vehicle tax is 5$ regardless of the year if the car type is electric and 5$ x carAge if the car type is hybrid.
Create CarType enum class and implement the annualTex method.
*
*ստեղծում եք նաև CarTypeTest  class test folder-ի com.aca.homework.week7.car.tax package-ում (ctrl+shift+T),
* հաշվում եք հիբրիդի համար տարեկան հարկը, եթե մեքենան արտադրվել է 2010 թվականին։ Նույն կերպ էլեկտրական մեքենայի համար, արտադրված 2015 թվականին։
*
* */
public enum Type {
    ELECTRIC,
    HYBRID;

    public int annualTaxOfElectric(int carYear) {
        int carAge = 2022 - carYear + 1;
        if (this == ELECTRIC) {
            return carAge * 5;
        } else {
            return ((2 * 5 + ((carAge - 1) * 5)) * carAge) / 2;
        }
    }
}
