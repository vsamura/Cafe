package com.example.cafe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MaceOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mace_order);
        TextView greetings = findViewById(R.id.textViewGreetings);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        greetings.setText(getResources().getString(R.string.hello_what, name));
    }

    public static Intent newIntent(Context context, String userName){
        Intent intent = new Intent(context, MaceOrderActivity.class);
        intent.putExtra("name", userName);
        return intent;
    }
}