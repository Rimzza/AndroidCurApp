package com.example.listeners;

import android.view.View;
import android.widget.AdapterView;
import com.example.adapters.SpinneHelper;
import Internet.Connection;
import Internet.RecipientCur;



public class SpinnerListenerUp extends SpinnerListener {





    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        SpinneHelper.selectedCurUp = (String) parent.getItemAtPosition(position);
        RecipientCur recipientCur = new RecipientCur(new Connection(SpinneHelper.selectedCurUp));
        SpinneHelper.countCur.setNominator(recipientCur.getMoney());
        if (SpinneHelper.selectedCurDown != null)
            SpinneHelper.countCur.findRatio();

        if (getEditTextUp().getText() != null) {
            getGetEditTextDown().setText(String.format("%.5f", SpinneHelper.countCur.getCur()));
        }

    }









}
