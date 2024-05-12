package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Calendar;

public class Money {


        @JsonProperty("Cur_ID")
        private int Cur_ID;

        @JsonProperty("Date")
        private Calendar Date;

        @JsonProperty("Cur_Abbreviation")
        private String Cur_Abbreviation;

        @JsonProperty("Cur_Scale")
        private int Cur_Scale;

        @JsonProperty("Cur_Name")
        private String Cur_Name;

        @JsonProperty("Cur_OfficialRate")
        private double Cur_OfficialRate;

    public Money() {
    }

    public Money(int cur_ID, Calendar date, String cur_Abbreviation, int cur_Scale, String cur_Name, double cur_OfficialRate) {
        Cur_ID = cur_ID;
        Date = date;
        Cur_Abbreviation = cur_Abbreviation;
        Cur_Scale = cur_Scale;
        Cur_Name = cur_Name;
        Cur_OfficialRate = cur_OfficialRate;
    }

        public int getCur_ID() {
        return Cur_ID;
    }

        public void setCur_ID(int cur_ID) {
        Cur_ID = cur_ID;
    }

        public Calendar getDate() {
        return Date;
    }

        public void setDate(java.util.Calendar date) {
        Date = date;
    }

        public String getCur_Abbreviation() {
        return Cur_Abbreviation;
    }

        public void setCur_Abbreviation(String cur_Abbreviation) {
        Cur_Abbreviation = cur_Abbreviation;
    }

        public int getCur_Scale() {
        return Cur_Scale;
    }

        public void setCur_Scale(int cur_Scale) {
        Cur_Scale = cur_Scale;
    }

        public String getCur_Name() {
        return Cur_Name;
    }

        public void setCur_Name(String cur_Name) {
        Cur_Name = cur_Name;
    }

        public double getCur_OfficialRate() {
        return Cur_OfficialRate;
    }

        public void setCur_OfficialRate(double cur_OfficialRate) {
        Cur_OfficialRate = cur_OfficialRate;
    }


}
