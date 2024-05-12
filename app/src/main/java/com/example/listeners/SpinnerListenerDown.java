package com.example.listeners;

import android.view.View;
import android.widget.AdapterView;
import com.example.adapters.SpinneHelper;
import Internet.Connection;
import Internet.RecipientCur;

public class SpinnerListenerDown extends SpinnerListener {



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        SpinneHelper.selectedCurDown = (String) parent.getItemAtPosition(position);
        RecipientCur recipientCur = new RecipientCur(new Connection(SpinneHelper.selectedCurDown));
        SpinneHelper.countCur.setDenominator(recipientCur.getMoney());
        if (SpinneHelper.selectedCurUp != null)
            SpinneHelper.countCur.findRatio();

        if (getEditTextUp().getText() != null) {
            getGetEditTextDown().setText(String.format("%.5f", SpinneHelper.countCur.getCur()));
        }
    }




}
