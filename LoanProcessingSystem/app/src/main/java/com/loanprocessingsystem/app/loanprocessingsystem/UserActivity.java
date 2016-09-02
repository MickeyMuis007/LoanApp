package com.loanprocessingsystem.app.loanprocessingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
    public void clickUserAdd(View view){
        Intent intent = new Intent(getApplicationContext(),UserAddActivity.class);

        startActivity(intent);
    }

    public void clickUserUpdate(View view){
        Intent intent = new Intent(getApplicationContext(),UserAddActivity.class);
        startActivity(intent);
    }

    public void clickUserDelete(View view){
        Intent intent = new Intent(getApplicationContext(),UserAddActivity.class);
        startActivity(intent);
    }
}
