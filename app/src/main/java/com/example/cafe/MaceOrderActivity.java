package com.example.cafe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MaceOrderActivity extends AppCompatActivity {

    private static final String USER_NAME = "name";

    private TextView textViewgGreetings;
    private RadioGroup radioGroup;
    private RadioButton radioButtonTee;
    private RadioButton radioButtonCoffe;
    private TextView textViewAdditives;
    private CheckBox checkBoxMilk;
    private CheckBox checkBoxSahar;
    private CheckBox checkBoxLemon;
    private Spinner spinnerTee;
    private Spinner spinnerCoffe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mace_order);
        initviews();
        setupUserName();

    }

    private void setupUserName(){
        String name = getIntent().getStringExtra(USER_NAME);
        String resultName = getString(R.string.hello_what, name);
        textViewgGreetings.setText(resultName);
    }

    private void initviews(){
        textViewgGreetings = findViewById(R.id.textViewGreetings);
        radioGroup = findViewById(R.id.radioGroup);
        radioButtonTee = findViewById(R.id.radioTee);
        radioButtonCoffe = findViewById(R.id.radioCoffe);
        textViewAdditives = findViewById(R.id.textViewAdditives);
        checkBoxMilk = findViewById(R.id.checkBoxMilk);
        checkBoxSahar = findViewById(R.id.checkBoxSahar);
        checkBoxLemon = findViewById(R.id.checkBoxLemon);
        spinnerTee = findViewById(R.id.spinerTee);
        spinnerCoffe = findViewById(R.id.spinerCoffe);
    }

    public static Intent newIntent(Context context, String userName){
        Intent intent = new Intent(context, MaceOrderActivity.class);
        intent.putExtra(USER_NAME, userName);
        return intent;
    }
}