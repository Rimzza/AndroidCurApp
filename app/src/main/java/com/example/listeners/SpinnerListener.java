package com.example.listeners;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;

abstract class SpinnerListener implements OnItemSelectedListener {

    private EditText editTextUp;
    private EditText getEditTextDown;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public EditText getEditTextUp() {
        return editTextUp;
    }

    public void setEditTextUp(EditText editTextUp) {
        this.editTextUp = editTextUp;
    }

    public EditText getGetEditTextDown() {
        return getEditTextDown;
    }

    public void setGetEditTextDown(EditText getEditTextDown) {
        this.getEditTextDown = getEditTextDown;
    }
}
