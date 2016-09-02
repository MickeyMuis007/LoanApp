package com.loanprocessingsystem.app.loanprocessingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);
    }

    public void clickLoanAdd(View view){
        Intent intent = new Intent(getApplicationContext(),CustomerAddActivity.class);

        startActivity(intent);
    }

    public void clickLoanUpdate(View view){
        Intent intent = new Intent(getApplicationContext(),CustomerAddActivity.class);
        startActivity(intent);
    }

    public void clickLoanDelete(View view){
        Intent intent = new Intent(getApplicationContext(),CustomerAddActivity.class);
        startActivity(intent);
    }
}
