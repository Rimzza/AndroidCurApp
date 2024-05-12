package Instruments;

import models.Money;

public class CreateBYN {

    public static Money get(){
        Money money = new Money();
        money.setCur_Name("Белорусский рубль");
        money.setCur_ID(0);
        money.setCur_OfficialRate(1);
        money.setCur_Scale(1);
        money.setCur_Abbreviation("BYN");
        return money;
    }
}
