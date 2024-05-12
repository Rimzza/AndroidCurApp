package com.example.currencerate;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.adapters.SpinneHelper;
import com.example.listeners.EditTextListenerUp;
import com.example.listeners.SpinnerListenerDown;
import com.example.listeners.SpinnerListenerUp;


public class MainActivity extends AppCompatActivity {

    private EditText textCurUp;
    private EditText textCurDown;
    private Spinner spinnerCurUp;
    private Spinner spinnerCurDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initialization();
        SpinneHelper spinnerUp = new SpinneHelper(this, spinnerCurUp, "adapterUp");
        spinnerUp.createAdapter();
        SpinneHelper spinnerDown = new SpinneHelper(this, spinnerCurDown, "adapterDown");
        spinnerDown.createAdapter();
        SpinnerListenerUp listenerUp = new SpinnerListenerUp();
        SpinnerListenerDown listenerDown = new SpinnerListenerDown();
        spinnerUp.setListener(listenerUp);
        spinnerDown.setListener(listenerDown);
        EditTextListenerUp textListenerUp = new EditTextListenerUp(textCurDown);
        listenerUp.setEditTextUp(textCurUp);
        listenerUp.setGetEditTextDown(textCurDown);
        listenerDown.setEditTextUp(textCurUp);
        listenerDown.setGetEditTextDown(textCurDown);
        textCurUp.addTextChangedListener(textListenerUp);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }



    private void initialization() {
        textCurUp = findViewById(R.id.text_cur_up);
        textCurDown = findViewById(R.id.text_cur_down);
        spinnerCurUp = findViewById(R.id.spinner_cur_up);
        spinnerCurDown = findViewById(R.id.spinner_cur_down);
        textCurDown.setFocusable(false);
        textCurDown.setEnabled(false);
    }
}