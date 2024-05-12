package com.example.adapters;

import android.content.Context;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import MathematicalOperations.CountCur;
import enums.Currency;
import pool.AdapterPool;

public class SpinneHelper  {

    private Context context;
    private Spinner spinner;
    private String name;
    private ArrayAdapter<String> adapter;
    private List<String> list;
    public static String selectedCurUp;
    public static String selectedCurDown;

    public static CountCur countCur = new CountCur();

    public SpinneHelper(Context context, Spinner spinner, String name) {
        this.context = context;
        this.spinner = spinner;
        this.name = name;
    }

    public void createAdapter() {
        list = new ArrayList<>( Arrays.asList(Currency.getValuesString()));
        adapter = new ArrayAdapter<>(context, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        setAdapter(adapter);
        AdapterPool.addAdapter(adapter, name);


    }

    public ArrayAdapter<String> getAdapter() {
        return adapter;
    }

    public void setAdapter(ArrayAdapter<String> adapter) {
        spinner.setAdapter(adapter);
    }

    public void setListener (OnItemSelectedListener listener) {
        spinner.setOnItemSelectedListener(listener);

    }
}
