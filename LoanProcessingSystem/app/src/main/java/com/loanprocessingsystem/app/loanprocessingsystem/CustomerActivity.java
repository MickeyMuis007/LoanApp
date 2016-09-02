package com.loanprocessingsystem.app.loanprocessingsystem;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
    }
    public void clickCustomerAdd(View view){
        Intent intent = new Intent(getApplicationContext(),CustomerAddActivity.class);

        startActivity(intent);
    }

    public void clickCustomerUpdate(View view){
        Intent intent = new Intent(getApplicationContext(),CustomerAddActivity.class);
        startActivity(intent);
    }

    public void clickCustomerDelete(View view){
        Intent intent = new Intent(getApplicationContext(),CustomerAddActivity.class);
        startActivity(intent);
    }
}
