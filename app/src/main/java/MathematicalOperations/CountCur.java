package MathematicalOperations;


import com.example.adapters.SpinneHelper;
import models.Money;

public class CountCur {


    private Integer valueInt;
    private Double valueDouble;
    private double ratio;
    private Money nominator;
    private Money denominator;


    public CountCur() {

    }


    public void findRatio() {
        double curNominator = nominator.getCur_OfficialRate() / nominator.getCur_Scale();
        double curDenominator = denominator.getCur_OfficialRate() / denominator.getCur_Scale();
        ratio = curNominator / curDenominator;
    }

    public void findRatioBYN() {
        double curNominator = 0.0;
        double curDenominator = 0.0;

        if (SpinneHelper.selectedCurUp.equals("BYN")) {
            curNominator = 1.0;
            curDenominator = denominator.getCur_OfficialRate() / denominator.getCur_Scale();
        } else {
            curDenominator = 1.0;
            curNominator = nominator.getCur_OfficialRate() / nominator.getCur_Scale();
        }
        ratio = curNominator / curDenominator;
    }



    public double getCur() {
        if (valueDouble != null)
            return valueDouble * ratio;
        else if (valueInt != null)
            return valueInt * ratio;
        return 0.0;

    }

    public void setValue(String value, Class aClass) {
        if (aClass == Integer.class)
            setValueInt(Integer.parseInt(value));
        else
            setValueDouble(Double.parseDouble(value));
    }

    public void setValueInt(Integer valueInt) {
        this.valueInt = valueInt;
    }

    public void setValueDouble(Double valueDouble) {
        this.valueDouble = valueDouble;
    }


    public void setNominator(Money nominator) {
        this.nominator = nominator;
    }

    public void setDenominator(Money denominator) {
        this.denominator = denominator;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }
}
