package com.example.listeners;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.example.adapters.SpinneHelper;
import Instruments.CheckNumber;

public abstract class EditTextListener implements TextWatcher {



    private String value;
    private EditText editText;

    public EditTextListener(EditText editText) {
        this.editText = editText;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        value = String.valueOf(s);
        if (CheckNumber.isInt(value)) {
            SpinneHelper.countCur.setValueDouble(null);
            SpinneHelper.countCur.setValueInt(Integer.valueOf(value));
        } else if (CheckNumber.isDouble(value)) {
            SpinneHelper.countCur.setValueDouble(Double.valueOf(value));
            SpinneHelper.countCur.setValueInt(null);
        } else {
            SpinneHelper.countCur.setValueDouble(null);
            SpinneHelper.countCur.setValueInt(null);
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }




    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EditText getEditText() {
        return editText;
    }
}
