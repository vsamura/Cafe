package com.example.cafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    protected EditText name;
    protected EditText password;
    protected Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString().trim();
                String userPassword = password.getText().toString().trim();
                if(!userName.isEmpty() && !userPassword.isEmpty()){
                    launchNextScreen(userName);
                } else {
                    Toast.makeText(
                            MainActivity.this,
                            getString(R.string.error),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void launchNextScreen(String userName){
        Intent intent = MaceOrderActivity.newIntent(this, userName);
        startActivity(intent);
    }

    private void initviews(){
        name = findViewById(R.id.editTextName);
        password = findViewById(R.id.editTextPassword);
        enter = findViewById(R.id.buttonEnter);
    }
}