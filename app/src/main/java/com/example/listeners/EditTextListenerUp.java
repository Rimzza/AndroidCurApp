package com.example.listeners;

import android.text.Editable;
import android.widget.EditText;
import com.example.adapters.SpinneHelper;

public class EditTextListenerUp extends EditTextListener {



    public EditTextListenerUp(EditText editText) {
        super(editText);
    }



    @Override
    public void afterTextChanged(Editable s) {
        double cur = SpinneHelper.countCur.getCur();
        getEditText().setText(String.format("%.5f", cur));
    }
}
